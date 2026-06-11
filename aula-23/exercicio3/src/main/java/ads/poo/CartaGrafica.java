package ads.poo;


import edu.princeton.cs.algs4.Draw;

public class CartaGrafica {

    private Naipe naipe;
    private Valor valor;
    private int x;
    private int y;
    private boolean virada;

    public CartaGrafica(Naipe naipe, Valor valor, int x, int y, boolean virada) {
        this.naipe = naipe;
        this.valor = valor;
        this.x = x;
        this.y = y;
        this.virada = virada;
    }

    public void desenhar(Draw d){
        if(virada) {
            d.picture(x, y, "cartas/cartas/" + valor.inicial + naipe.inicia + ".png");
        } else {
            d.picture(x, y, "cartas/cartas/fundoa.png");
        }
        d.show();
    }

    public boolean clicouDentro(double x, double y){
        if ((x <= this.x + 36 && x >= this.x - 36) && (y <= this.y + 48 && y >= this.y - 48)){
            virada = !virada;
            return true;
        }
            return false;
    }

}
