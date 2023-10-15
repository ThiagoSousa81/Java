package Empresa;
class Cliente { 

    private String nome = "";
    private String telefone = ""; 
    private String cpf = "";

    public void salvar_Cliente(nome, telefone, cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String consultar_Cliente(String nome) {
        return "Nome: " + this.nome + "\nTelefone: " + this.telefone + "\nCPF: " + this.cpf;
    }

    public String relatorio() {
        return "Clientes\nNome: " + this.nome + "\nTelefone: " + this.telefone + "\nCPF: " + this.cpf;
    }
}