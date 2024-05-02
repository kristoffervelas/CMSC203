import static org.junit.Assert.*;
import org.junit.Test;

public class SizeTestStudent {

    @Test
    public void testGetOunces() {
        assertEquals(8, Size.SMALL.getOunces());
        assertEquals(12, Size.MEDIUM.getOunces());
        assertEquals(16, Size.LARGE.getOunces());
    }
}
