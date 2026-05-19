package ads.poo;

import ads.poo.produtos.Dimensao;
import ads.poo.produtos.SemFio;
import ads.poo.produtos.Telefone;

public class Main {
    static void main(String[] args) {

        Telefone t = new Telefone();
        SemFio sf = new SemFio();
        Telefone a = new SemFio();

        Telefone[] vetor = new Telefone[3];

        vetor[0] = new Telefone();
        vetor[1] = new SemFio();
        vetor[2] = new SemFio();

        for(Telefone aux : vetor){
            if (aux instanceof SemFio novo){
                IO.println(novo.getFrequencia());
            }
        }
    }
}
