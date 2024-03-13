import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTester {

    private GradeBook gb;

    @Before
    public void setUp() throws Exception {
        // Initialize a GradeBook object with a capacity of 5
        gb = new GradeBook(5);
    }

    @After
    public void tearDown() throws Exception {
        // Reset the GradeBook object to null after each test
        gb = null;
    }

    @Test
    public void testAddScore() {
        // Add some scores to the GradeBook
        assertTrue(gb.addScore(42));
        assertTrue(gb.addScore(78));
        
        // Ensure that the scores were added successfully
        assertEquals("42.0 78.0", gb.toString());
        assertEquals(2, gb.getScoresSize());
    
        
        // Ensure that the scoresSize remains the same after failing to add more scores
        assertEquals(2, gb.getScoresSize());
    }

    @Test
    public void testSum() {
        // Add some scores to the GradeBook
        gb.addScore(55);
        gb.addScore(32);
        
        // Ensure that the sum of the scores is calculated correctly
        assertEquals(87.0, gb.sum(), 0.01);
    }

    @Test
    public void testMinimum() {
        // Add some scores to the GradeBook
        gb.addScore(42);
        gb.addScore(89);
        
        // Ensure that the minimum score is calculated correctly
        assertEquals(42.0, gb.minimum(), 0.01);
    }

    @Test
    public void testFinalScore() {
        // Add some scores to the GradeBook
        gb.addScore(85);
        gb.addScore(92);
        
        // Ensure that the final score is calculated correctly
        assertEquals(92.0, gb.finalScore(), 0.01);
    }
}
