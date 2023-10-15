package Empresa;
class Funcionario {
    Cliente c = new Cliente();
    Vendas v = new Vendas();
    
    String nome;
    String email;
    String Usuario;
    String Senha;

    public void cadastrar_Cliente(String nome, String telefone, String cpf){               
        c.salvar_Cliente(nome, telefone, cpf);
    }

    public String consultar_Cliente(String nome) {
        c.consultar_Cliente(nome);
    }

    public void realizar_Venda(){
        
    }    
}