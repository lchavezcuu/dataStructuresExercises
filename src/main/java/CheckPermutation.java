import java.util.Arrays;

/**
 * Created by luis on 12/01/17.
 */
public class CheckPermutation {

    /* Given two strings, write a method to decode if one is permutation
    of the other */
    public static boolean IsPermutation(String s1, String s2){
        char [] charS1=s1.toCharArray();
        Arrays.sort(charS1);
        char [] charS2=s2.toCharArray();
        Arrays.sort(charS2);

        if(Arrays.equals(charS1,charS2)){
            return true;
        }

        return false;
    }
}
