package TreeSet;

import java.util.Comparator;

/**
 * Created by luis on 15/01/17.
 */
public class UserNameComparator implements Comparator <User> {
    public int compare(User o1, User o2) {

        if(o1.getName().compareTo(o2.getName()) == 0){
            return o1.getLastName().compareTo(o2.getLastName());
        }
        return o1.getName().compareTo(o2.getName());
    }
}
