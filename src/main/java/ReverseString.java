import java.util.Stack;

/**
 * Created by luis on 15/01/17.
 */
public class ReverseString {

    public static String ReverseString(String sentence){
        char [] charSentence=sentence.toCharArray();
        Stack <Character> myStack=new Stack<Character>();
        StringBuilder mySb=new StringBuilder();

        for (Character character: charSentence) {
            myStack.push(character);
        }

        while (!myStack.isEmpty()){
            mySb.append(myStack.pop());
        }

        return mySb.toString();
    }

}
