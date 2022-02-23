public class Verificator {
    private static String realLogin = "admin";
    private static String realPassword = "admin";

    public static boolean verifLogin(String login) throws LoginException {

        if(!login.equals(realLogin)){
            throw new LoginException("Invalid login");
        }

        return true;
    }

    public static boolean verifPassword(String password) throws PasswordException {
        if(!password.equals(realPassword)){
            throw new PasswordException("Invalid password");
        }

        return true;
    }
}
