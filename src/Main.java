import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean rezult = false;


        System.out.println("Enter your login:");
        while (rezult == false) {
            try {
                rezult = Verificator.verifLogin(scanner.nextLine());
                System.out.println("Correct login.");
            } catch (LoginException e) {
                System.out.println(e.getMessage());
                System.out.println("Try again");
            }
        }

        System.out.println("Enter your password:");
        rezult = false;
        while (rezult == false) {
            try {
                rezult = Verificator.verifPassword(scanner.nextLine());
                System.out.println("Correct password.");
            } catch (PasswordException e) {
                System.out.println(e.getMessage());
                System.out.println("Try again");
            }
        }


    }
}
