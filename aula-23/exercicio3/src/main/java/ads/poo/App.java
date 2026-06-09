package ads.poo;

import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.util.ArrayList;

public class App implements DrawListener {
    private ArrayList cartas = new ArrayList<Carta>();

    private Draw draw;

    public App(){
        this.draw = new Draw();
        this.draw.setTitle("Jogo de cartas");
        this.draw.setCanvasSize(1200,600);
        this.draw.setXscale(0,1200);
        this.draw.setYscale(0,600);
        this.draw.setDefaultCloseOperation(3);
        this.draw.enableDoubleBuffering();
        this.draw.addListener(this);
        CartaGrafica carta = new CartaGrafica(Naipe. COPAS, Valor.REI, 200, 200, false);

        carta.desenhar(this.draw);

    }

    @Override
    public void mouseClicked(double x, double y) {
        this.draw.picture(x, y, "cartas/cartas/1p.png");
        this.draw.show();
    }


    static void main(String[] args) {

        App app = new App();


    }
}