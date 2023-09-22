package Empresa;
class Cliente {
    int codigo = 0;
    String nome = "";
    String telefone = ""; 
    String cpf = "";

    String[] registros = new String[100][4];

    public void salvar_Cliente() {
        registros[this.codigo][0] = this.codigo;
        registros[this.codigo][1] = this.nome;
        registros[this.codigo][2] = this.telefone;
        registros[this.codigo][3] = this.cpf;
        this.codigo++;
    }
}