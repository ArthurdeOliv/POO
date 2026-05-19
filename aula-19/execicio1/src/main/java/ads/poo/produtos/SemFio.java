package ads.poo.produtos;

public class SemFio extends Telefone {

    private double frequencia;
    private int canais;
    private double distancia;

    public SemFio(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, double frequencia, int canais, double distancia) {
        super(codigo, numSerie, modelo, peso, dimensao);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distancia = distancia;
    }

    public SemFio() {

    }

    public double getFrequencia() {
    return frequencia;

}@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SemFio{");
        sb.append(super.toString());
        sb.append("frequencia=").append(frequencia);
        sb.append(", canais=").append(canais);
        sb.append(", distancia=").append(distancia);
        sb.append('}');
        return sb.toString();
    }
}
