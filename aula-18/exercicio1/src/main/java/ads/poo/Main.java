import ads.poo;
import edu.princeton.cs.algs4.Draw;


import java.awt.*;
import java.util.concurrent.TimeUnit;


public class Main {
    static void main(String[] args) throws InterruptedException {


        Draw draw = new Draw();
        draw.setCanvasSize(800,800);
        draw.setYscale(0,800);
        draw.setXscale(0,800);


        draw.setFontSize(30);


        for (int i = 10; i > 0; i--) {
            draw.clear();
            draw.text(400,400,"" + i);
            draw.show();
            TimeUnit.SECONDS.sleep(1);
        }


        draw.clear();
        draw.setPenColor(Color.RED);


        draw.filledCircle(350, 500, 100);
        draw.filledCircle(450, 500, 100);


        double[] x = {250, 550, 400};
        double[] y = {500, 500, 200};
        draw.filledPolygon(x, y);


        draw.setPenColor(Color.WHITE);
        draw.setFontSize(50);
        draw.text(400,400,"Ketlyn");


        draw.show();
    }
}

