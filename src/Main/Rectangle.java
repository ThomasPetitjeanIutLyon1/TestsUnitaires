
public class Rectangle implements Shape{

    private Point topLeftCorner;
    private int width, height;

    public Rectangle(Point topLeftCorner, int width, int height) {
        this.topLeftCorner = topLeftCorner;
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean contains(Point p) {
        if(p.getX() > this.topLeftCorner.getX() && p.getX() < this.width && p.getY() > this.topLeftCorner.getY() && p.getY() < this.height){
            return true;
        }
        else return false;
    }

    @Override
    public double area() {
        return this.width * this.height;
    }
}
