import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int opcao, escolha;
        Iphone iphone = new Iphone();

        System.out.println("Bem-vindo ao Iphone");
        System.out.println("Escolha uma funcionalidade");
        System.out.println("1 para Reprodutor musical");
        System.out.println("2 para Aparelho telefônico");
        System.out.println("3 para Navegador internet");
        System.out.println("9 para Sair");
        opcao = Integer.parseInt(scanner.nextLine());
        limparTela();

        switch (opcao) {
            case 1:
                System.out.println("Seja bem-vindo ao Reprodutor músical");
                System.out.println("escolha uma opção.: ");
                System.out.println("1 tocar música");
                System.out.println("2 pausar música");
                System.out.println("3 selecionar música");
                escolha = Integer.parseInt(scanner.nextLine());
                
                switch (escolha) {
                    case 1:
                        iphone.tocar();
                        break;
                    case 2:
                        iphone.pausar();
                        break;
                    case 3:
                        iphone.selecionarMusica("minha música");
                        break;

                    default:
                    System.out.println("opção inválida");
                        break;
                }
                break;
            case 2:
                System.out.println("Seja bem-vindo ao Aparelho telefônico");
                System.out.println("escolha uma opção.: ");
                System.out.println("1 ligar");
                System.out.println("2 atender");
                System.out.println("3 correio de voz");
                escolha = Integer.parseInt(scanner.nextLine());
                switch (escolha) {
                    case 1:
                        iphone.ligar("81991588298");
                        break;
                    case 2:
                        iphone.atender();
                        break;
                    case 3:
                        iphone.iniciarCorreioVoz();
                        break;

                    default:
                    System.out.println("opção inválida");
                        break;
                }

                break;
            case 3:
                System.out.println("Seja bem-vindo ao Navegador de internet");
                System.out.println("escolha uma opção.: ");
                System.out.println("1 exibir página");
                System.out.println("2 adicionar nova aba");
                System.out.println("3 atualizar página");
                escolha = Integer.parseInt(scanner.nextLine());
                switch (escolha) {
                    case 1:
                        iphone.exibirPagina("google.com");
                        break;
                    case 2:
                        iphone.adicionarNovaAba();
                        break;
                    case 3:
                        iphone.atualizarPagina();
                        break;

                    default:
                    System.out.println("opção inválida");
                        break;
                }
                break;

            default:
                System.out.println("opção inválida.");
                break;
        }

        scanner.close();
    }

    static void limparTela() throws InterruptedException, IOException {
        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            Runtime.getRuntime().exec("clear");
        }
    }
}
