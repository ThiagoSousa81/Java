package Empresa;
class Gerente {    
    String nome;

    Vendas v = new Vendas();

    public String obter_Relatorio_Vendas() {
        return v.relatorio();
    }    
}