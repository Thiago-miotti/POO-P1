import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Reserva> reservaLista = new ArrayList<>();

        String opcao;

        Scanner scan = new Scanner(System.in);

        do {
            printMenu();
            System.out.print("> ");
            opcao = scan.next();

            switch (opcao.toLowerCase()) {
                case "1":
//                    String gerenteVendedor = criarSubmenu();
//                    cadastrarEmpregado(lista_empregado, gerenteVendedor);
                    break;
                case "2":
//                    cadastrarCliente(lista_cliente);
                    break;
                case "3":
//                    Pesquisar(lista_empregado, lista_cliente);
                    break;
                case "4":
//                    ListarEmpregados(lista_empregado);
                    break;
                case "5":
//                    ListarClientes(lista_cliente);
                    break;


                default:
                    System.out.println("Opcao invalida");
            }

        } while (!opcao.equals("6"));

            scan.close();
        }
        public static void printMenu() {
            System.out.println("--- Restaurante Sabor Sofisticado ---");
            String menu = "";

            menu += "1. Reservar mesa\n" +
                    "2. Pesquisar reserva\n" +
                    "3. Imprimir reserva\n" +
                    "4. Imprimir lista de espera\n" +
                    "5. Cancelar reserva\n" +
                    "6. Finalizar\n";

            System.out.println(menu);
        }

        public static void reservarmesa(ArrayList<Reserva> reserva_mesa, String opcao){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Nome: ");
            String nome = scanner.nextLine();


        }
    }



