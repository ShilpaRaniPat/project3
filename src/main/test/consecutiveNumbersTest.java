
import static org.junit.Assert.*;

public class consecutiveNumbersTest {
    consecutiveNumbers check= new consecutiveNumbers();


    @org.junit.Before
    public void setUp() throws Exception {
        consecutiveNumbers check= new consecutiveNumbers();
        //consecutiveNumbers check_no= new consecutiveNumbers();

    }

    @org.junit.After
    public void tearDown() throws Exception {
        check=null;

    }

    @org.junit.Test
    public void checkConsecutive() {
        String Expectedvalue="consecutive numbers are present";
        String Actualvalue=check.CheckConsecutive("57,60,58,59,56");
        assertEquals(Expectedvalue,Actualvalue);
    }
}