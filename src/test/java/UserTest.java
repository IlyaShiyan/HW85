import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class UserTest {
    private User user;
    private User user1;
    private User user2;

    @Before
    public void setUp() throws Exception {
        user = new User("Аркадий", 29, Gender.MALE);
        user1 = new User("Аня", 43, Gender.FEMALE);
        user2 = new User("Полина", 14, Gender.FEMALE);
    }

    @Test
    public void getAllUsers() {
        List<User> expected = User.getAllUsers();

        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllUsers_NO_NULL() {
        List<User> expected = User.getAllUsers();
        Assert.assertNotNull(expected);
    }

    @Test
    public void getAllUsers_MALE() {
        List<User> expected = User.getAllUsers(Gender.MALE);

        List<User> actual = new ArrayList<>();
        actual.add(user);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllUsers_MALE_NO_NULL() {
        List<User> expected = User.getAllUsers(Gender.MALE);
        Assert.assertNotNull(expected);
    }

    @Test
    public void getAllUsers_FEMALE() {
        List<User> expected = User.getAllUsers(Gender.FEMALE);

        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllUsers_FEMALE_NO_NULL() {
        List<User> expected = User.getAllUsers(Gender.FEMALE);
        Assert.assertNotNull(expected);
    }

    @Test
    public void getHowManyUsers() {
        int expected = User.getHowManyUsers();

        int actual = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHowManyUsers_MALE() {
        int expected = User.getHowManyUsers(Gender.MALE);

        int actual = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHowManyUsers_FEMALE() {
        int expected = User.getHowManyUsers(Gender.FEMALE);

        int actual = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllAgeUsers() {
        int expected = User.getAllAgeUsers();

        int actual = 35 + 34 + 7;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllAgeUsers_MALE() {
        int expected = User.getAllAgeUsers(Gender.MALE);

        int actual = 35;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllAgeUsers_FEMALE() {
        int expected = User.getAllAgeUsers(Gender.FEMALE);

        int actual = 34 + 7;

        Assert.assertEquals(expected, actual);
    }
}