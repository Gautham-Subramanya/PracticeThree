import org.junit.Test;

import static org.junit.Assert.*;

public class PlacesArrayTest {

    @Test
    public void check(){
        PlacesArray obj = new PlacesArray();
        String[] passed = new String[5];
        passed[0] = "India";
        passed[1] = "United States";
        passed[2] = "Germany";
        passed[3] = "Egypt";
        passed[4] = "czechoslovakia";
        String[] expected = new String[5];
        expected[0]="Ind";
        expected[1]="Untd Stts";
        expected[2]="Grmny";
        expected[3]="Egypt";
        expected[4]="czchslvk";
        assertEquals(expected, obj.places(passed, 5));
    }

    @Test
    public void checkfail(){
        PlacesArray obj1 = new PlacesArray();
        String[] passed = new String[2];
        passed[0] = "Australia";
        passed[1] = "India";
        String[] expected = new String[2];
        expected[0] = "Austrl";
        expected[1] = "Ind";
        assertNotEquals(expected, obj1.places(passed,2));
    }

}