import static org.junit.Assert.*;
import org.junit.Test;

public class TypeTestStudent {

    @Test
    public void testTypeEnum() {
        assertEquals("COFFEE", Type.COFFEE.name());
        assertEquals("SMOOTHIE", Type.SMOOTHIE.name());
        assertEquals("ALCOHOL", Type.ALCOHOL.name());

        assertEquals(Type.COFFEE, Type.valueOf("COFFEE"));
        assertEquals(Type.SMOOTHIE, Type.valueOf("SMOOTHIE"));
        assertEquals(Type.ALCOHOL, Type.valueOf("ALCOHOL"));

        assertEquals(3, Type.values().length);
    }
}

