import static org.junit.Assert.*;
import org.junit.Test;

public class DayTestStudent {

    @Test
    public void testDayEnum() {
        assertEquals("MONDAY", Day.MONDAY.name());
        assertEquals("TUESDAY", Day.TUESDAY.name());
        assertEquals("WEDNESDAY", Day.WEDNESDAY.name());
        assertEquals("THURSDAY", Day.THURSDAY.name());
        assertEquals("FRIDAY", Day.FRIDAY.name());
        assertEquals("SATURDAY", Day.SATURDAY.name());
        assertEquals("SUNDAY", Day.SUNDAY.name());

        assertEquals(Day.MONDAY, Day.valueOf("MONDAY"));
        assertEquals(Day.TUESDAY, Day.valueOf("TUESDAY"));
        assertEquals(Day.WEDNESDAY, Day.valueOf("WEDNESDAY"));
        assertEquals(Day.THURSDAY, Day.valueOf("THURSDAY"));
        assertEquals(Day.FRIDAY, Day.valueOf("FRIDAY"));
        assertEquals(Day.SATURDAY, Day.valueOf("SATURDAY"));
        assertEquals(Day.SUNDAY, Day.valueOf("SUNDAY"));

        assertEquals(7, Day.values().length);
    }
}

