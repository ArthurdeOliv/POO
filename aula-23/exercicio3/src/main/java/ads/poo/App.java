package ads.poo;

import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.util.ArrayList;
import java.util.Arrays;

public class App implements DrawListener {


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
        carta.desenhar(this.draw);
        this.draw.show();
        dado.desenhar(this.draw);
        dado.jogar();
        dado.desenhar(this.draw);
    }

    DadoGrafico dado = new DadoGrafico(1, 300, 300);
    CartaGrafica carta = new CartaGrafica(Naipe. COPAS, Valor.REI, 200, 200, false);

    @Override
    public void mouseClicked(double x, double y) {
        if (carta.clicouDentro(x, y)) {
            carta.desenhar(this.draw);
            this.draw.show();
        } else {
            dado.clicouDentro(x, y);
            System.out.println(Arrays.toString(dado.est));
            dado.desenhar(this.draw);
            this.draw.show();
        }
    }

    static void main(String[] args) {
        App app = new App();
    }
}