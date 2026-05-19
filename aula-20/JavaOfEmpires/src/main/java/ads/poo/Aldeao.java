package ads.poo;

public class Aldeao extends Personagem  implements Guerreiro{

    public Aldeao(int hp, int atq, double vel){
        super(25, 1, 0.8);
    }

    @Override
    public String atacar(){

        return "Aldeao atacando";
    }

    @Override
    public String mover(){

        return "Aldeao se movendo";
    }
}