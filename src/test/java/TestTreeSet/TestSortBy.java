package TestTreeSet;

import TreeSet.TreeSetImplementation;
import TreeSet.User;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

/**
 * Created by luis on 15/01/17.
 */
public class TestSortBy {

    List<User> myUsers=new ArrayList<User>();
    @Before public void Initialize(){
        myUsers.add(new User(12,"Luis","Alducin"));
        myUsers.add(new User(1,"Luis","Chavez"));
        myUsers.add(new User(5,"Ricardo","Chavez"));
    }


    @Test
    public void TestSortById(){
        ArrayList <User> usersOrderedById = new ArrayList<User>();
        usersOrderedById.add(new User(1,"Luis","Chavez"));
        usersOrderedById.add(new User(5,"Ricardo","Chavez"));
        usersOrderedById.add(new User(12,"Luis","Alducin"));

        assertEquals(TreeSetImplementation.SortUsersById(myUsers), usersOrderedById);
    }

    @Test
    public void TestSortByName(){
        List <User> usersOrderedByName = new ArrayList<User>();
        usersOrderedByName.add(new User(12,"Luis","Alducin"));
        usersOrderedByName.add(new User(1,"Luis","Chavez"));
        usersOrderedByName.add(new User(5,"Ricardo","Chavez"));

        assertEquals(TreeSetImplementation.SortUsersByName(myUsers), usersOrderedByName);
    }

    @Test
    public void TestSortByLastName(){
        List <User> usersOrderedByLastName = new ArrayList<User>();
        usersOrderedByLastName.add(new User(12,"Luis","Alducin"));
        usersOrderedByLastName.add(new User(1,"Luis","Chavez"));
        usersOrderedByLastName.add(new User(5,"Ricardo","Chavez"));

        assertEquals(TreeSetImplementation.SortUsersByLastName(myUsers), usersOrderedByLastName);
    }
}
