import java.util.HashMap;

/**
 * Created by luis on 12/01/17.
 */
public class IsUnique {
 /*Implement an algorithm to determine is a string has all
 unique characters. What if you cannot use additional data structures?
 */
    public static boolean IsDuplicated(String word) {

        if(word == null || word == ""){
            return false;
        }

        word = word.trim();
        char [] wordArray= word.toCharArray();
        HashMap<Character, Character> myHashmap=new HashMap<Character, Character>();

        for (char character: wordArray){
            if(myHashmap.containsKey(character)){
                return true;
            }else{
                myHashmap.put(character,character);
            }
        }

        return false;
    }
}
