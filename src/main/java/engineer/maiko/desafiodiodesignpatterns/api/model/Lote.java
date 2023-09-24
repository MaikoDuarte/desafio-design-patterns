package engineer.maiko.desafiodiodesignpatterns.api.model;


public class Lote {
    private Long id;
    private String numeroLote;
    private int quantidadeEmLote;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public int getQuantidadeEmLote() {
        return quantidadeEmLote;
    }

    public void setQuantidadeEmLote(int quantidadeEmLote) {
        this.quantidadeEmLote = quantidadeEmLote;
    }
}
