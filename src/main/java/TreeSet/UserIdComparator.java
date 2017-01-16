package TreeSet;
import java.util.Comparator;

/**
 * Created by luis on 15/01/17.
 */
public class UserIdComparator implements Comparator <User> {

    public int compare(User o1, User o2) {
        if(o1.getUserId()>o2.getUserId()){
            return 1;
        }else if(o1.getUserId() == o2.getUserId()){
            return 0;
        }
        return -1;
    }
}
