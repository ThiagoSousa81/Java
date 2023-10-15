package Empresa;
class Gerente {    
    String nome;

    Vendas v = new Vendas();
    Veiculos car = new Veiculos();
    Clientes c = new Clientes();
    Funcionario f = new Funcionario();

    public String obter_Relatorio_Vendas() {
        return v.relatorio();
    }    

    public String obter_Promocao_Veiculo() {
        return car.relatorio();
    }

    public String obter_Relatorio_Funcionarios() {
        return f.relatorio();        
    }

    public String obter_Relatorio_Clientes() {
        return c.relatorio();
    }
}