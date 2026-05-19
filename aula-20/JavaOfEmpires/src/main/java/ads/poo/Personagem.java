package ads.poo;

public class Personagem {

    private int hp;
    private int atq;
    private double vel;

    public Personagem(int hp, int atq, double vel) {
        this.hp = hp;
        this.atq = atq;
        this.vel = vel;
    }

    public String mover(){

        return "";
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("HP: ").append(hp);
        sb.append(", ATQ: ").append(atq);
        sb.append(", VEL: ").append(vel);
        return sb.toString();
    }

}