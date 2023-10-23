package Empresa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();
        String cmd;

        System.out.println("Sistema de Concessionária - Login");
        System.out.print("Usuário: ");
        String user = sc.nextLine();

        if (!user.equals("Admin")) {
            System.out.println("Você não tem permissão de acessar o sistema!");
            System.exit(0);
        }

        System.out.println("Escolha uma das opções abaixo:\n1 - Cadastro de Funcionários\n2 - Cadastro de Veículos\n3 - Gerar relatórios");
        cmd = sc.nextLine();

        switch (cmd) {
            case "1":
                System.out.println("Digite o nome do funcionário:");
                String nome = sc.nextLine();
                System.out.println("Digite o e-mail do funcionário:");
                String email = sc.nextLine();
                System.out.println("Digite o usuário do funcionário:");
                String usuario = sc.nextLine();
                f.cadastrar_Funcionario(nome, email, usuario);
                break;
            case "2":
                System.out.println("Digite o nome do veículo:");
                String nomeVeiculo = sc.nextLine();
                System.out.println("Digite o preço do veículo:");
                double preco = sc.nextDouble();
                car.cadastrar_Veiculo(nomeVeiculo, preco);
                break;
            case "3":
                System.out.println("Digite o nome do cliente:");
                String nomeCliente = sc.nextLine();
                System.out.println("Digite o nome do veículo:");
                String nomeVeiculo = sc.nextLine();
                System.out.println("Digite o preço do veículo:");
                double preco = sc.nextDouble();
                System.out.println("Digite o nome do funcionário:");
                String nomeFuncionario = sc.nextLine();
                System.out.println("Digite a data da venda:");
                String dataVenda = sc.nextLine();
                v.realizar_Venda(0, nomeCliente, nomeVeiculo, preco, nomeFuncionario, dataVenda);
                break;
            default:
                System.out.println("Função não identificada!");

        }
    }
}