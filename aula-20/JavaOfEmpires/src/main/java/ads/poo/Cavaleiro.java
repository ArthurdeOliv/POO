package ads.poo;

public class Cavaleiro extends Personagem implements Guerreiro{

    public Cavaleiro(int hp, int atq, double vel){
        super(50, 3, 2);
    }

    @Override
    public String atacar(){

        return "Cavaleiro atacando";
    }

    @Override
    public String mover(){

        return "Cavaleiro se movendo";
    }
}