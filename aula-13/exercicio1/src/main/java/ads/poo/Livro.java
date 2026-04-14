package ads.poo;

import java.util.ArrayList;

public class Livro {

    private String titulo;
    private Pessoa autor;
    private ArrayList<Capitulo> capitulos;

    public Livro(String t, Pessoa a) {
        this.titulo = t;
        this.autor = a;
        this.capitulos = new ArrayList<>();
    }

    public void adicionaCapitulo(String t){
        var cap = new Capitulo(titulo);
        capitulos.add(novoCapitulo);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        this.capitulos.forEach(sb::append);

        return String.format("""
                Livro: %s
                Autor: %n%s
                Capitulos: %n%s
                """, titulo, autor, sb.toString());

    }
}
