package ads.poo;

public class Arqueiro extends Personagem implements Guerreiro{

    public Arqueiro(int hp, int atq, double vel){
        super(35, 2, 1);
    }

    @Override
    public String atacar(){

        return "Arqueiro atacando";
    }

    @Override
    public String mover(){

        return "Arqueiro se movendo";
    }

}