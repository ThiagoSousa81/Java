package Empresa;
class Funcionario {
    Cliente c = new Cliente();
    Vendas v = new Vendas();
    
    String nome;
    String email;

    public void cadastrar_Cliente(int codigo, String nome, String telefone, String cpf){
        c.codigo = codigo;
        c.nome = nome;
        c.telefone = telefone;
        c.cpf = cpf;
        c.salvar_Cliente();
    }

    public void realizar_Venda(int codigo_Venda, int codigo_Cliente, int codigo_Funcionario, int codigos_Veiculos[]){
        v.codigo_Venda = codigo_Venda;
        v.codigo_Cliente = codigo_Cliente;
        v.codigo_Funcionario = v.codigo_Funcionario;
        v.codigos_Veiculos[] = codigos_Veiculos[];
    }

    public String consultar_Cliente(String nome) {

    }
}