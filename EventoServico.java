import java.util.List;

// interface para gerenciamento de eventos

public interface EventoServico {
    void cadastrarEvento(Evento evento);
    List<Evento> listarEventos();
    Evento buscarEventoPorNome(String nome);
    double calcularReceitaTotal();
}
