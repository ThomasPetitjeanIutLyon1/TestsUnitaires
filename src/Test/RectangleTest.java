import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    public static final double DELTA = 1e-6;


    @Test
    public void contains() {
        Point p1 = new Point(0,0);
        Rectangle rect1 = new Rectangle(p1,10,10);

        Point p2 = new Point(1,1); // x : 1 ; y : 1

        assertTrue(rect1.contains(p2));

        p2.move(50,0); // x : 51 ; y : 1

        assertFalse(rect1.contains(p2)); //Test si le point est horizontalement en dehors

        p2.move(-50, 50); // x : 1 ; y : 51

        assertFalse(rect1.contains(p2)); //Test si le point est verticalement en dehors

        p2.move(50,0); // x : 51 ; y : 51

        assertFalse(rect1.contains(p2)); //Test si le point est horizontalement et verticalement en dehors

    }

    @Test
    public void area() {
        Rectangle rectangle = new Rectangle(new Point(0,0), 5,5);
        assertEquals(rectangle.area(), 25, DELTA);

    }
}