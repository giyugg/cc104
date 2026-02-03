package MoneyTracker;

public class Credentials {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin1234";

    public static boolean isValid (String username, String password) {
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }
}