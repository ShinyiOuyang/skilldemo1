import static org.junit.Assert.*;
import org.junit.*;

public class SubtractorTester {
    
    @Test 
    public void subtractTest1 () {
        assertEquals(5, Subtractor.subtract(10, 5));
    }
}
