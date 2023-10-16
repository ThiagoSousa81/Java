package Empresa;

class Vendas {
    private int n_venda;
    private String cliente;
    private String carro; //Dificilmente alguém vai comprar 2 carros
    private double preco_Veiculo;
    private String funcionario;
    private String data; //O certo seria importar o tipo DateTime, mas é possível fazer sem ele

    public void realizar_Venda(int n_venda, String cliente, String carro, double preco_Veiculo, String funcionario, String data) {
        this.n_venda = n_venda;
        this.cliente = cliente;
        this.carro = carro;
        this.preco_Veiculo = preco_Veiculo;
        this.funcionario = funcionario;
        this.data = data;
    }

    public String relatorio(){        
        return "Vendas\nNome: " + this.cliente + "\nCarro: " + this.carro + "\nPreço: " + this.preco_Veiculo + "\nFuncionário: " + this.funcionario + "\nData: " + this.data;
    }

}