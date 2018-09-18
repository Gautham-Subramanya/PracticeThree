import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class StudentsMarksTest {
StudentsMarks obj=new StudentsMarks();
    @Test
    public void check(){
        assertEquals(true,obj.unlimitedParams("105","18","90","34","2","10"));

    }
    @Test
    public void checkfail(){
        assertNotEquals(false,obj.unlimitedParams("4","103","98","45","23"));
    }
}