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
            Application.Exit();
        }

        System.out.println("Escolha uma das opções abaixo:\n1 - Cadastro de Funcionários\n2 - Cadastro de Veículos\n3 - Gerar relatórios");
        cmd.nextLine();

        switch (cmd){

            case cmd == "1" :
                
            break;


        }
       
        
    }
}