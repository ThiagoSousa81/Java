package Empresa;
class Funcionario {
    Cliente c = new Cliente();
    Vendas v = new Vendas();
    Veiculos car = new Veiculos();
    
    String nome;
    String email;
    String Usuario;
    String Senha;

    public void cadastrar_Cliente(String nome, String telefone, String cpf){               
        c.salvar_Cliente(nome, telefone, cpf);
    } // Esse mesmo método é usado para alterar dados

    public String consultar_Cliente(String nome) {
        c.consultar_Cliente(nome);
    }

    public void realizar_Venda(){
        v.realizar_Venda(0, c.nome, car.nome, this.nome, "16/10/2023");
    }    
}