import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


 //Classe abstrata Evento (Generalização)
 
public abstract class Evento {
    private String nome;
    private LocalDate data;
    private String local;
    private int capacidade;
    private int ingressosVendidos;
    private List<Ingresso> ingressos = new ArrayList<>(); //Composição

    public Evento(String nome, LocalDate data, String local, int capacidade) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.capacidade = capacidade;
        this.ingressosVendidos = 0;
    }

    //Polimorfismo
    public abstract double calcularReceita();

    //Associação e composição
    public Ingresso venderIngresso(Cliente cliente, double valor) {
        if (ingressosVendidos >= capacidade) {
            throw new IllegalStateException("Evento esgotado!");
        }

        Ingresso ingresso = new Ingresso(this, cliente, valor);
        ingressos.add(ingresso);
        ingressosVendidos++;
        return ingresso;
    }

    public int ingressosDisponiveis() {
        return capacidade - ingressosVendidos;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;
    }

    public List<Ingresso> getIngressos() {
        return new ArrayList<>(ingressos);
    }

    protected void adicionarIngresso(Ingresso ingresso) {
        if (ingressosVendidos >= capacidade) {
            throw new IllegalStateException("Evento esgotado!");
        }
        ingressos.add(ingresso);
        ingressosVendidos++;
    }
}
