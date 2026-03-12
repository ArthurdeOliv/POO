package ads.poo;

public class Personagem {

    private int HP;
    private String nome;
    private String raca;
    private int forca;
    private double velocidade;


    public void setRaca(int r){
        switch (r) {
            case 1 -> "Humano";
            case 2 -> "Elfo";
            case 3 -> "orc";

        }
    }
    public void setHP(){

    }

    public void setForca(int forca) {
        forca = forca;
    }

    public void poder(){

   }
    public void setNome(){
        nome = n;
    }


}
