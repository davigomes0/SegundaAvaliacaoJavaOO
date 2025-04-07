import java.util.ArrayList;
import java.util.List;

// Implementação da interface EventoServico


public class EventoServicoImpl implements EventoServico {
    private List<Evento> eventos = new ArrayList<>();

    @Override
    public void cadastrarEvento(Evento evento) {
        eventos.add(evento);
    }

    @Override
    public List<Evento> listarEventos() {
        return new ArrayList<>(eventos); //protege a lista original
    }

    @Override
    public Evento buscarEventoPorNome(String nome) {
        return eventos.stream()
                .filter(e -> e.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }

    @Override
    public double calcularReceitaTotal() {
        return eventos.stream()
                .mapToDouble(Evento::calcularReceita)
                .sum();
    }
}
