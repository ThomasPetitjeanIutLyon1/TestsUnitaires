

import java.util.Objects;

public class Point {
    private final int x, y;


    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p){
       double dx = p.x - getX();
       double dy = p.y - getY();

       return Math.sqrt((Math.pow(dx,2))+(Math.pow(dy,2)));
    }

    public Point move (int dx, int dy){
        int x = getX() + dx;
        int y = getY() + dy;

        return new Point(x,y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}

