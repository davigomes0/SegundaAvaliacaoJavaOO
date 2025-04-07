import java.time.LocalDate;
import java.util.Arrays;


//         Classe principal de execução do sistema // MAIN

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Joao Silva", "123.456.789-00", "11999999999");
        Cliente cliente2 = new Cliente("Maria Souza", "987.654.321-00", "11888888888");

        Show show = new Show("Rock in Rio", LocalDate.of(2023, 10, 15),
                "Parque Olimpico", 100000, "Iron Maiden");

        Teatro teatro = new Teatro("Hamlet", LocalDate.of(2023, 11, 20),
                "Teatro Municipal", 500, "Hamlet", "Jose Diretor");

        EventoServico eventoService = new EventoServicoImpl();
        eventoService.cadastrarEvento(show);
        eventoService.cadastrarEvento(teatro);

        Ingresso ingressoShow1 = show.venderIngresso(cliente1, 350.0);
        IngressoVIP ingressoShowVIP = show.venderIngresso(cliente2, 600.0,
                Arrays.asList("Camarote", "Open Bar", "Estacionamento"));

        Ingresso ingressoTeatro1 = teatro.venderIngresso(cliente1, 80.0);

        System.out.println("=== CLIENTES CADASTRADOS ===");
        cliente1.exibirInformacoes();
        cliente2.exibirInformacoes();
        System.out.println("Total de clientes: " + Cliente.getTotalClientes());

        System.out.println("\n=== INGRESSOS VENDIDOS ===");
        ingressoShow1.exibirDetalhes();
        System.out.println();
        ingressoShowVIP.exibirDetalhes();
        System.out.println();
        ingressoTeatro1.exibirDetalhes();

        System.out.println("\n=== DADOS DOS EVENTOS ===");
        System.out.println("Ingressos disponíveis para " + show.getNome() + ": " + show.ingressosDisponiveis());
        System.out.println("Receita do show: R$ " + String.format("%.2f", show.calcularReceita()));
        System.out.println("Ingressos disponíveis para " + teatro.getNome() + ": " + teatro.ingressosDisponiveis());
        System.out.println("Receita do teatro: R$ " + String.format("%.2f", teatro.calcularReceita()));

        System.out.println("\n=== RESUMO FINANCEIRO ===");
        System.out.println("Receita total: R$ " + String.format("%.2f", eventoService.calcularReceitaTotal()));
    }
}
