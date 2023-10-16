package Empresa;
class Gerente {    
    String nome;

    Vendas v = new Vendas();
    Veiculos car = new Veiculos();
    Clientes c = new Clientes();
    Funcionario f = new Funcionario();

    public void cadastrar_Funcionario(String nome, String email, String Usuario, String Senha) {
        f.nome = nome;
        f.email = email;
        f.Usuario = Usuario;
        f.Senha = Senha;
    }

    public void cadastrar_Veiculo(int id_veiculo, int ano_Veiculo, String nome_Veiculo, String marca_Veiculo, double preco_Veiculo) {
        car.id_veiculo = id_veiculo;
        car.ano_Veiculo = ano_Veiculo;
        car.nome_Veiculo = nome_Veiculo;
        car.marca_Veiculo = marca_Veiculo;
        car.preco_Veiculo = preco_Veiculo;
    }

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