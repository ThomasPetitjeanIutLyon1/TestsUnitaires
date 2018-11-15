package Test;

import Main.Point;
import com.sun.deploy.pings.Pings;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        Point p = new Point(1,5);

        Point p2 = new Point(5,7);


    }

    @Test
    public void move() {
        Point p = new Point(1,1);

        Point p2 = p.move(1,1);
        assertNotSame(p,p2);

        assertEquals(p2.getX(),2);
        assertEquals(p2.getY(),2);
    }
}