import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by luis on 12/01/17.
 */
public class TestCheckPermutation {

    @Test
    public void TestIsPermutation(){
        assertTrue(CheckPermutation.IsPermutation("hola","ahol"));
        assertFalse(CheckPermutation.IsPermutation("hola","ahola"));
        assertTrue(CheckPermutation.IsPermutation("agua","ugaa"));
        assertTrue(CheckPermutation.IsPermutation("pan","nap"));
    }
}
