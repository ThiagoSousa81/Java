package Empresa;
import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();
        String cmd;

        System.out.println("Sistema de Concessionária - Login");
        System.out.print("Usuário: ");
        String user = sc.nextLine();

        if (user != "Admin") {
            System.out.println("Você não tem permissão de acessar o sistema!");
        }

        while (true) {
            System.out.println("Digite a ação que deseja realizar:\n\n1 - Consultar Cliente\n2 - Cadastrar Cliente\n3 - Realizar venda");
            cmd = sc.next();

            if (cmd == 1) {
                System.out.println("\nCadastro de Clientes.");
                System.out.println("\n");
                f.cadastrar_Cliente();
            }
            else
                if (cmd == 2) {
                System.out.println("\nConsulta de Cliente");
            }
            else
                if (cmd == 3) {
                System.out.println("\nRealizar venda");          
            }
        }
    }
}