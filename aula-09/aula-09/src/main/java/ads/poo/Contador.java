package ads.poo;

public class Contador {
    
    private int valorAtual;

    public void setValorAtual(int x) {
        valorAtual = x;
    }

    public void incrementador(){
        valorAtual = valorAtual + 1;
    }

    public int ValorAtual() {
        return valorAtual;
    }

}
