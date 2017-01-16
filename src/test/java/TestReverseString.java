import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by luis on 15/01/17.
 */
public class TestReverseString {

    @Test
    public void TestReverseString(){
        assertEquals(ReverseString.ReverseString("hola"),"aloh");
        assertEquals(ReverseString.ReverseString("mauha!"),"!ahuam");
        assertEquals(ReverseString.ReverseString("_!2##$"),"$##2!_");
        assertEquals(ReverseString.ReverseString("sEny"),"ynEs");
        assertEquals(ReverseString.ReverseString("Hboom"),"moobH");
    }

}
