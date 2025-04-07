import java.util.ArrayList;
import java.util.List;

//Classe que representa um ingresso VIP

public class IngressoVIP extends Ingresso {
    private List<String> beneficios;

    public IngressoVIP(Evento evento, Cliente cliente, double valor, List<String> beneficios) {
        super(evento, cliente, valor);
        this.beneficios = new ArrayList<>(beneficios);
    }

    //Polimorfismo 
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo: VIP");
        System.out.println("Beneficios: " + String.join(", ", beneficios));
    }

    public List<String> getBeneficios() {
        return new ArrayList<>(beneficios); 
    }
}
