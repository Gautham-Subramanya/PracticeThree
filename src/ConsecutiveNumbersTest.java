import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {

    @Test
    public void check(){
        ConsecutiveNumbers obj = new ConsecutiveNumbers();
        assertEquals(true, obj.checkConsecutive("91,92,93,94,95,96,97"));
    }

    @Test
    public void check1(){
        ConsecutiveNumbers obj1 = new ConsecutiveNumbers();
        assertNotEquals(true, obj1.checkConsecutive("91,92,99,98,96,97,94"));
    }


}