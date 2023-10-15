package Empresa;
class Funcionario {
    Cliente c = new Cliente();
    Vendas v = new Vendas();
    
    String nome;
    String email;

    public void cadastrar_Cliente(String nome, String telefone, String cpf){               
        c.salvar_Cliente(nome, telefone, cpf);
    }

    public void realizar_Venda(){
        
    }

    public String consultar_Cliente(String nome) {
        c.consultar_Cliente(nome);
    }
}