package Main.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {

    public void salvaJson(ConversorDeMoedas convesor, Object conversor) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter("conversao.json");
        escrita.write(gson.toJson(conversor));
        escrita.close();

    }
}
