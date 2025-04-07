// Classe que representa um Ingresso

public class Ingresso {
    private static int proximoId = 1; //atributo estático

    private int id;
    private Evento evento;
    private Cliente cliente;
    private double valor;

    public Ingresso(Evento evento, Cliente cliente, double valor) {
        this.id = proximoId++;
        this.evento = evento;
        this.cliente = cliente;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public Evento getEvento() {
        return evento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    //polimorfismo 
    public void exibirDetalhes() {
        System.out.println("Ingresso #" + id + " para " + evento.getNome());
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Valor: R$ " + valor);
    }
}
