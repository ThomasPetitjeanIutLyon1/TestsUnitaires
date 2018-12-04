

public class Circle implements Shape{

    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public boolean contains(Point p) {
        if(Math.sqrt(Math.pow(p.getX() - this.center.getX(),2) + Math.pow(p.getY() - this.center.getY(), 2)) <= this.radius){
            return true;
        }
        else return false;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}