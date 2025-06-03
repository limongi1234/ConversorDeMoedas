package Main.modelos;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ConversorDeMoedas {

    public static double obterTaxaDeCambio(String de, String para) {
        try {
            URI conversor = URI.create("https://api.exchangerate.host/convert?from=" + de + "&to=" + para + "&apikey=");

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(conversor)
                    .GET()
                    .build();

            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Parse do JSON usando Gson
            Gson gson = new Gson();
            JsonObject json = gson.fromJson(response.body(), JsonObject.class);

            return json.getAsJsonObject("info").get("rate").getAsDouble();

        } catch (Exception e) {
            System.out.println("Erro ao obter taxa de câmbio: " + e.getMessage());
            return -1;
        }
    }
}

