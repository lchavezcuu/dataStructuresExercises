import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by luis on 12/01/17.
 */
public class TestIsUnique
{
    @Test
    public void isDuplicated(){
        assertTrue(IsUnique.IsDuplicated("holo"));
        assertTrue(IsUnique.IsDuplicated("hsddsdso"));
        assertTrue(IsUnique.IsDuplicated("asdarererdwwedwedw"));
        assertTrue(IsUnique.IsDuplicated("1_344??!"));
        assertTrue(IsUnique.IsDuplicated("__$###&*?"));
        assertFalse(IsUnique.IsDuplicated("agus"));
        assertFalse(IsUnique.IsDuplicated(""));
    }
}
