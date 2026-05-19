package ads.poo;


public class Main {
    static void main() {

        Personagem[] vetor = new Personagem[3];
        vetor[0] = new Aldeao();
        vetor[1] = new Arqueiro();
        vetor[2] = new Cavaleiro();


        for (Personagem a : vetor){
        IO.println(a.atacar());
        if (a instanceof Guerreiro g){
            g.atacar();
        }

        }
    }
}
