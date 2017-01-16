import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by luis on 15/01/17.
 */
public class TestInterviewProblem {

    @Test
    public void TestIsAnagram(){
        assertTrue(InterviewProblem.IsAnagram("yah","ahy"));
        assertTrue(InterviewProblem.IsAnagram("adfredsa","darfedsa"));
        assertTrue(InterviewProblem.IsAnagram("4_!5","!_45"));
        assertFalse(InterviewProblem.IsAnagram("wopiu","wopuij"));
        assertFalse(InterviewProblem.IsAnagram("asasasddd","12wwe"));
        assertFalse(InterviewProblem.IsAnagram("123wwww","321wer"));
    }
}
