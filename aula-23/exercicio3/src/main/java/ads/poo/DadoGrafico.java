package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class DadoGrafico extends Dado{

    private int x;
    private int y;

    public DadoGrafico(int face, int x, int y) {
        super(face);
        this.x = x;
        this.y = y;
    }

    public void desenhar(Draw d){
        d.picture(x, y, "dados/"+ (face +1) + ".png");
        d.show();
    }

    public boolean clicouDentro(double x, double y){
        if ((x <= this.x + 25 && x >= this.x - 25) && (y <= this.y + 25 && y >= this.y - 25)){
            jogar();
            return true;
        }
        return false;
    }





}
