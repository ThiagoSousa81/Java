package Empresa;
class Funcionario {
    Cliente c = new Cliente();
    
    public void cadastrar_Cliente(int codigo, String nome, String telefone, String cpf){
        c.codigo = codigo;
        c.nome = nome;
        c.telefone = telefone;
        c.cpf = cpf;
    }

    public void realizar_Venda(int codigo_Venda, int codigo_Cliente, int codigo_Funcionario, int codigos_Veiculos){

    }

    public String consultar_Cliente(String nome) {

    }
}