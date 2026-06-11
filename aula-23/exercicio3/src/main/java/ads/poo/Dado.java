package ads.poo;

import java.util.Random;

public class Dado {

    protected int face;
    protected int[] est = new int[6];
    Random r = new Random();

    public Dado(int face) {
        this.face = face;
    }

    public int jogar(){
        face = r.nextInt(6);
        est[face] ++;
        return face;
    }



}
