package Empresa;
class Cliente {    
    String nome = "";
    String telefone = ""; 
    String cpf = "";


    public void salvar_Cliente(nome, telefone, cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }
}