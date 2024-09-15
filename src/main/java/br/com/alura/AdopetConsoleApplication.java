package br.com.alura;

import java.util.Scanner;

public class AdopetConsoleApplication {

    public static void main(String[] args) {

        CommandExecutor executor = new CommandExecutor();

        System.out.println("##### BOAS VINDAS AO SISTEMA ADOPET CONSOLE #####");
        try {
            int opcaoEscolhida = 0;
            while (opcaoEscolhida != 5) {
                exibeMenu();

                String textoDigitado = new Scanner(System.in).nextLine();
                opcaoEscolhida = Integer.parseInt(textoDigitado);

                switch (opcaoEscolhida) {
                    case 1 -> executor.executeCommand(new ListarAbrigoCommand());
                    case 2 -> executor.executeCommand(new CadastrarAbrigoCommand());
                    case 3 -> executor.executeCommand(new ListarPetsDoAbrigoCommand());
                    case 4 -> executor.executeCommand(new ImportarPetsDoAbrigoCommand());
                    case 5 -> System.exit(0);
                    default -> opcaoEscolhida = 0;
                }
//                switch (opcaoEscolhida){
//                    case 1:
//                        executor.executeCommand(new ListarAbrigoCommand());
//                        break;
//                    case 2:
//                        executor.executeCommand(new CadastrarAbrigoCommand());
//                        break;
//                    case 3:
//                        executor.executeCommand(new ListarPetsDoAbrigoCommand());
//                        break;
//                    case 4:
//                        executor.executeCommand(new ImportarPetsDoAbrigoCommand());
//                        break;
//                    case 5:
//                        break;
//                    default:
//                        System.out.println("NÚMERO INVÁLIDO!");
//                        opcaoEscolhida = 0;
//                        break;
//                }
                System.out.println("Finalizando o programa...");

            }
//    private static HttpResponse<String> dispararRequisicaoGet(HttpClient client, String uri) throws IOException, InterruptedException {
////        HttpClient client = HttpClient.newHttpClient();
////        String uri = "http://localhost:8080/abrigos";
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create(uri))
//                .method("GET", HttpRequest.BodyPublishers.noBody())
//                .build();
//        return client.send(request, HttpResponse.BodyHandlers.ofString());
//
//    }
//
//    private static HttpResponse<String> dispararRequisicaoPost(HttpClient client, String uri, JsonObject json) throws IOException, InterruptedException {
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create(uri))
//                .header("Content-Type", "application/json")
//                .method("POST", HttpRequest.BodyPublishers.ofString(json.toString()))
//                .build();
//
//        return client.send(request, HttpResponse.BodyHandlers.ofString());
//
//    }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void exibeMenu() {
        System.out.println("\nDIGITE O NÚMERO DA OPERAÇÃO DESEJADA:");
        System.out.println("1 -> Listar abrigos cadastrados");
        System.out.println("2 -> Cadastrar novo abrigo");
        System.out.println("3 -> Listar pets do abrigo");
        System.out.println("4 -> Importar pets do abrigo");
        System.out.println("5 -> Sair");
    }
}
