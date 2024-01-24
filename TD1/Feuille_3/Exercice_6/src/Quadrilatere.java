package src;

public class Quadrilatere {
    private Point p0, p1, p2, p3;
    Quadrilatere(Point p0, Point p1, Point p2, Point p3){
        this.p0 = p0;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public void setP0(Point p0) {
        this.p0 = p0;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

}
