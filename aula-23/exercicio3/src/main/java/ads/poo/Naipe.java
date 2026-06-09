package ads.poo;

public enum Naipe {
    OUROS(1, "o"),
    ESPADAS(2, "e"),
    COPAS(3, "c"),
    PAUS(4, "p");

    public  int valor;
    public  final String inicia;

    Naipe(int valor, String inicia) {
        this.valor = valor;
        this.inicia = inicia;
    }
}
