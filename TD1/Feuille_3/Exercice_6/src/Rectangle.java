package src;

public class Rectangle extends Quadrilatere{

    Point p0, p1, p2, p3;

    Rectangle(Point p0, Point p2) {
        contruire(){

        };
        super(p0, p1, p2, p3);

        Point p1 = null, p3 = null;
        this.contruire(this.p0, this.p2);

    }

    public void contruire(Point p0, Point p2){
        this.p1.x = p2.getX();
        this.p1.y = p0.getY();

        this.p3.x = p0.getX();
        this.p3.y = p2.getY();
    }
}
