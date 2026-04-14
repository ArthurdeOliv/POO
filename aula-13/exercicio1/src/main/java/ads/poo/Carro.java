package ads.poo;

public class Carro {

    String marca;
    private Motor propulsor;

     public Carro(String ma, Motor mo) {
        this.marca = ma;
        this.propulsor = mo;
    }

    public void acelerar(int v){
        propulsor.acelerar(v);
    }

    public void trocaMotor(Motor m){
         this.propulsor = m;
    }


}
