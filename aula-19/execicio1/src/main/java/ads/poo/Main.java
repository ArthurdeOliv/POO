package ads.poo;

import ads.poo.produtos.Dimensao;
import ads.poo.produtos.SemFio;
import ads.poo.produtos.Telefone;

public class Main {
    static void main() {

    Telefone t = new Telefone(1234, "1324","21321", 100, new Dimensao(7,5,9));
    SemFio sf = new SemFio(1, "123", "123", 20, new Dimensao(4,2,3), 200, 5, 2000);

        IO.println(t);
        IO.println(sf);

    }
}
