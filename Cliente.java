
 //Classe Cliente que herda de Pessoa
 
public class Cliente extends Pessoa {
    private String telefone;
    private static int totalClientes = 0; //Atributo estático compartilhado por todas as instâncias

    public Cliente(String nome, String cpf, String telefone) {
        super(nome, cpf);
        this.telefone = telefone;
        totalClientes++; //Incrementa total de clientes
    }

    //polimorfismo
    @Override
    public void exibirInformacoes() {
        System.out.println("Cliente: " + getNome() + ", CPF: " + getCpf() + ", Tel: " + telefone);
    }

    public static int getTotalClientes() {
        return totalClientes;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
