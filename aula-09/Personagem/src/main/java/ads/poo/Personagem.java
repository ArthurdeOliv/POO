package ads.poo;

public class Personagem {

    private int HP;
    private String nome;
    private String raca;
    private int forca;
    private double velocidade;

    public Personagem(String nome, int r) {
        this.nome = nome;
        setRaca(r);
    }

    public void setRaca(int r) {
        switch (r) {
            case 1 -> statusHumano();
            case 2 -> statusElfo();
            case 3 -> statusOrc();
            default -> statusDesconhecida();
        }
    }

    private void statusHumano() {
        raca = "Humano";
        HP = 100;
        forca = 50;
        velocidade = 50;
    }

    private void statusElfo() {
        raca = "Elfo";
        HP = 80;
        forca = 60;
        velocidade = 90;
    }

    private void statusOrc() {
        raca = "Orc";
        HP = 200;
        forca = 90;
        velocidade = 20;
    }

    private void statusDesconhecida() {
        raca = "Desconhecida";
        HP = 50;
        forca = 50;
        velocidade = 50;
    }