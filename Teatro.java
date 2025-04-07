import java.time.LocalDate;

//Classe Teatro que herda de Evento


public class Teatro extends Evento {
    private String peca;
    private String diretor;

    public Teatro(String nome, LocalDate data, String local, int capacidade, String peca, String diretor) {
        super(nome, data, local, capacidade);
        this.peca = peca;
        this.diretor = diretor;
    }

    @Override
    public double calcularReceita() {
        // desconto de 20%
        return getIngressos().stream().mapToDouble(Ingresso::getValor).sum() * 0.8;
    }

    //getters e setters
    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
