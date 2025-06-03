package Main;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
                    System.out.println("Conversor de Moedas:" + "\n" +
                    "1. Dólar (USD) -> Real (BRL)" + "\n" +
                    "2. Euro (EUR) -> Real (BRL)" + "\n" +
                    "3. Real (BRL) -> Dólar (USD)" + "\n" +
                    "4. Real (BRL) -> Euro (EUR)" + "\n" +
                    "5. Dólar (USD) -> Euro (EUR)" + "\n" +
                    "6. Euro (EUR) -> Dólar (USD)" + "\n" +
                    "7. Sair" + "\n" +
                    "Escolha uma opção: ");

                    opcao = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer

                    String de = "", para = "";

                    switch (opcao) {
                        case 1:
                            de = "USD";
                            para = "BRL";
                            break;
                        case 2:
                            de = "EUR";
                            para = "BRL";
                            break;
                        case 3:
                            de = "BRL";
                            para = "USD";
                            break;
                        case 4:
                            de = "BRL";
                            para = "EUR";
                            break;
                        case 5:
                            de = "USD";
                            para = "EUR";
                            break;
                        case 6:
                            de = "EUR";
                            para = "USD";
                            break;
                        case 7:
                            System.out.println("Saindo...");
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            continue;
                    }

                    if (opcao >= 1 && opcao <= 6) {
                        System.out.print("Valor a converter: ");
                        double valor = scanner.nextDouble();

                        double taxa = obterTaxaDeCambio(de, para);

                        if (taxa != -1) {
                            double convertido = valor * taxa;
                            System.out.printf("Taxa: %.4f%nValor convertido: %.2f %s%n", taxa, convertido, para);
                        } else
                            System.out.println("Erro ao obter taxa de câmbio.");
                    }

                } while (opcao != 7);

                scanner.close();
            }

            // Exemplo fictício de taxas de câmbio
            public static double obterTaxaDeCambio(String de, String para) {
                if (de.equals("USD") && para.equals("BRL")) return 5.30;
                if (de.equals("EUR") && para.equals("BRL")) return 5.70;
                if (de.equals("BRL") && para.equals("USD")) return 0.19;
                if (de.equals("BRL") && para.equals("EUR")) return 0.175;
                if (de.equals("USD") && para.equals("EUR")) return 0.88;
                if (de.equals("EUR") && para.equals("USD")) return 1.14;
                return -1; // taxa inválida
            }
   }

