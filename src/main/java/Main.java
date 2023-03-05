
public class Main {
    public static void main(String[] args) {


        new User("Антон", 28, Gender.MALE);
        new User("Таня", 31, Gender.FEMALE);
        new User("Вера", 19, Gender.FEMALE);
        new User("Виктор", 43, Gender.MALE);

        System.out.println("всех пользователей: " + User.getHowManyUsers());
        System.out.println("всех пользователей MALE: " + User.getHowManyUsers(Gender.MALE));
        System.out.println("всех пользователей FEMALE: " + User.getHowManyUsers(Gender.FEMALE));
        System.out.println("общий возраст всех пользователей: " + User.getAllAgeUsers());
        System.out.println("общий возраст всех пользователей MALE: " + User.getAllAgeUsers(Gender.MALE));
        System.out.println("общий возраст всех пользователей FEMALE: " + User.getAllAgeUsers(Gender.FEMALE));
        System.out.println("средний возраст всех пользователей: " + User.getAverageAgeOfAllUsers());
        System.out.println("средний возраст всех пользователей MALE: " + User.getAverageAgeOfAllUsers(Gender.MALE));
        System.out.println("средний возраст всех пользователей FEMALE: " + User.getAverageAgeOfAllUsers(Gender.FEMALE));
        System.out.println("Все пользователи: MALE");
        User.getAllUsers(Gender.MALE).forEach(System.out::println);
        System.out.println("Все пользователи: FEMALE");
        User.getAllUsers(Gender.FEMALE).forEach(System.out::println);


    }
}
