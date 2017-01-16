package TreeSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by luis on 15/01/17.
 */
public class TreeSetImplementation {

    public static List<User> SortUsersById(List<User> myUsers){
        Set<User> myTreeSet= new TreeSet<User>(new UserIdComparator());
        for (User user : myUsers) {
            myTreeSet.add(user);
        }
        return new ArrayList<User>(myTreeSet);
    }

    public static List<User> SortUsersByName(List<User> myUsers){
        Set<User> myTreeSet= new TreeSet<User>(new UserNameComparator());
        for (User user : myUsers) {
            myTreeSet.add(user);
        }
        return new ArrayList<User>(myTreeSet);
    }

    public static List<User> SortUsersByLastName(List<User> myUsers){
        Set<User> myTreeSet= new TreeSet<User>(new UserLastNameComparator());
        for (User user : myUsers) {
            myTreeSet.add(user);
        }
        return new ArrayList<User>(myTreeSet);
    }

}
