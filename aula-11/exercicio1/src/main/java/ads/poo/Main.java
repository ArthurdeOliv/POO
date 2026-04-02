package ads.poo;


import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Juca");
        lista.add("Maria");
        lista.add("Pedro");
        lista.add("Maria");

        for (String elemento: lista) {
            if (elemento.equals("Maria")) {
                IO.println(elemento);
            }
        }

        lista.forEach(e -> IO.println(e));

    }
}
