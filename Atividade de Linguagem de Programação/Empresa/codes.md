CENTRO TERRITORIAL DE EDUCAÇÃO PROFISSIONAL – RECÔNCAVO II – ALBERTO TORRES<br>
DATA: 16 DE OUTUBRO DE 2023<br>
ALUNO: THIAGO SANTOS SOUSA<br>
PROFESSOR: VÁGNER CABRAL<br>SÉRIE: 3º ANO
DISCIPLINA: LINGUAGEM DE PROGRAMAÇÃO<br>	TURMA: INFORMÁTICA MATUTINO


> Funcionarios.java

    package Empresa;
    class Funcionario {
        Cliente c = new Cliente();
        Vendas v = new Vendas();
        Veiculos car = new Veiculos();
        
        String nome;
        String email;
        String Usuario;
        String Senha;

        public void cadastrar_Cliente(String nome, String telefone, String cpf){               
            c.salvar_Cliente(nome, telefone, cpf);
        } // Esse mesmo método é usado para alterar dados

        public String consultar_Cliente(String nome) {
            c.consultar_Cliente(nome);
        }

        public String consultar_Veiculo(String nome) {
            return "R$ " + car.retonar_Preco(nome);
        }

        public void realizar_Venda(){
            v.realizar_Venda(0, c.nome, car.nome, car.retonar_Preco(), this.nome, "16/10/2023");
        }    

        public String relatorio() {
            return "Funcionáios\nNome: " + this.nome + "\nE-Mail: " + this.email + "\nUsuário: " + this.Usuario;
        }
    }

> Cliente.java

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

> Vendas.java

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

> Veiculos.java

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

> Gerente.java

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

        public void cadastrar_Veiculo(int id_veiculo, int ano_Veiculo, String nome_Veiculo, String marca_Veiculo, double preco_Veiculo, double desconto_Veiculo) {
            car.id_veiculo = id_veiculo;
            car.ano_Veiculo = ano_Veiculo;
            car.nome_Veiculo = nome_Veiculo;
            car.marca_Veiculo = marca_Veiculo;
            car.preco_Veiculo = preco_Veiculo;
            car.desconto_Veiculo = desconto_Veiculo;
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