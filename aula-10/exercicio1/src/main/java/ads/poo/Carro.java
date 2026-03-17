package ads.poo;

public class Carro {
    private String modelo;
    private double velocidadeAtual;
    private double velocidadeMax;
    private static final int VEL_MAX_MODELOS = 300;
    private static final int VEL_MIN = 0;

    public Carro(String modelo, double velocidadeMax) {
        this.modelo = modelo;
        this.velocidadeMax = velocidadeMax;
        this.velocidadeAtual = 0;
    }

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void acelerar(int i){
        if (velocidadeAtual + i < velocidadeMax){
            velocidadeAtual = velocidadeAtual + i;
        } else {
            velocidadeAtual = velocidadeMax;
        }
    }

    public void freiar(int d){
        if (velocidadeAtual - d < VEL_MIN){
            velocidadeAtual = velocidadeAtual - d;
        } else {
            velocidadeAtual = VEL_MIN;
        }
    }

    public double getVelocidadeAtual(){
        return velocidadeAtual;
    }
}