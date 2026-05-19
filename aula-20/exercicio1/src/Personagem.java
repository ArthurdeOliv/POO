public class Personagem {

    private int hp;
    private int atq;
    private double vel;

    public Personagem(int hp, int atq, double vel) {
        this.hp = hp;
        this.atq = atq;
        this.vel = vel;
    }

    public int getHp() {
        return hp;
    }

    public int getAtq() {
        return atq;
    }

    public double getVel() {
        return vel;
    }

    public String atacar(){

        return "";
    }

    public String mover(){

        return "";
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personagem{");
        sb.append("hp=").append(hp);
        sb.append(", atq=").append(atq);
        sb.append(", vel=").append(vel);
        sb.append('}');
        return sb.toString();
    }

}