import java.time.LocalDate;
import java.util.List;


//Classe Show que herda de Evento

public class Show extends Evento {
    private String artista;

    public Show(String nome, LocalDate data, String local, int capacidade, String artista) {
        super(nome, data, local, capacidade);
        this.artista = artista;
    }

    @Override
    public double calcularReceita() {
        return getIngressos().stream().mapToDouble(Ingresso::getValor).sum();
    }

    //Polimorfismo
    public IngressoVIP venderIngresso(Cliente cliente, double valor, List<String> beneficios) {
        IngressoVIP ingresso = new IngressoVIP(this, cliente, valor, beneficios);
        adicionarIngresso(ingresso); //método protegido da superclasse
        return ingresso;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
}
