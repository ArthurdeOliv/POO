package ads.poo.produtos;

public class Telefone {

    private int codigo;
    private String numSerie;
    private String modelo;
    private double peso;
    private Dimensao dim;

    public Telefone(int codigo, String numSerie, String modelo, double peso, Dimensao dim) {
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.peso = peso;
        this.dim = dim;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Telefone{");
        sb.append("codigo=").append(codigo);
        sb.append(", numSerie='").append(numSerie).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", peso=").append(peso);
        sb.append(", dim=").append(dim);
        sb.append('}');
        return sb.toString();
    }
}
