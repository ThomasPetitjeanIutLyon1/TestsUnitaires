import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void contains() {
        Circle circle = new Circle(new Point(0,0), 5);
        //Test si le point est dans le cercle
        Point p = new Point(0,1);
        assertTrue(circle.contains(p));
        //test si le point n'est pas dans le cercle
        Point p2 = new Point(-9,2);
        assertFalse(circle.contains(p2));
        //test si le point est sur le périmètre en x
        Point p3 = new Point(5,0);
        assertTrue(circle.contains(p3));
        //test si le point est sur le périmètre en y
        Point p4 = new Point(0,5);
        assertTrue(circle.contains(p3));

    }

    @Test
    public void area() {
    }
}