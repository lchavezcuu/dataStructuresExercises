import java.util.Arrays;

/**
 * Created by luis on 14/01/17.
 */
public class InterviewProblem {
    //Given two strings verify if they are anagrams

    public static boolean IsAnagram( String s1, String s2){
        char [] arrayS1=s1.toCharArray();
        char [] arrayS2=s2.toCharArray();

        Arrays.sort(arrayS1);
        Arrays.sort(arrayS2);

        if(InterviewProblem.myEquals(arrayS1,arrayS2)){
            System.out.println("Equals");
            return true;
        }
        System.out.println("Not equals");
        return false;

    }

    public static boolean myEquals(char [] s1, char [] s2){
        if(s1.length!=s2.length){
            return false;
        }

        for(int i=0; i<s1.length;i++){
            if(s1[i]!=s2[i]){
                return false;
            }
        }

        return true;
    }
}
