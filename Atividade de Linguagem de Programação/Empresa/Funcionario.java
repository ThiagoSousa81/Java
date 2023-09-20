package Empresa;
class Funcionario {
    Cliente c = new Cliente();
    
    public void cadastrar_Cliente(int codigo, String nome, String telefone, String cpf){
        c.codigo = codigo;
        c.nome = nome;
        c.telefone = telefone;
        c.cpf = cpf;
    }



    public String consultar_Cliente(String nome) {

    }
}