package Empresa;
class Funcionario {

    public void cadastrar_Cliente(int codigo, String nome, String telefone, String cpf){
        Cliente c = new Cliente();
        c.codigo = codigo;
        c.nome = nome;
        c.telefone = telefone;
        c.cpf = cpf;
    }
}