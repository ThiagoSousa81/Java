package Empresa;
class Veiculos{
    private int id_veiculo, ano_Veiculo;
    private String nome_Veiculo, marca_Veiculo;
    private double preco_Veiculo, desconto_Veiculo;

    public double retornar_Preco(String nome) {
        return preco_Veiculo-((preco_Veiculo*desconto_Veiculo)/100);
    }

    public String relatorio() {
        return "Veículos\nVeículo: " + this.nome_Veiculo + "\nMarca: " + this.marca_Veiculo + "\nAno: " + this.ano_Veiculo + "\nPreço: " + this.preco_Veiculo;
    }


}