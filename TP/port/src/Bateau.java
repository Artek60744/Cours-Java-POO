package src;

public class Bateau {

    private final int pos_x;
    private final int pos_y;

    Bateau(int pos_x, int pos_y){
        this.pos_x = pos_x;
        this.pos_y = pos_y;
    }

    public int getPos_x(){
        return pos_x;
    }
    public int getPos_y(){
        return pos_y;
    }
}
