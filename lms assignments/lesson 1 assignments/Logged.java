
//WRITE A JAVA PROGRAM TO CHECK WHEATHER USER LOGGED IN OR NOT USING SUITABLE CONTROL STATEMENTS?
import java.util.Scanner;

public class Logged {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter true or false");
        boolean isLoggedIn = input.nextBoolean();
        if (isLoggedIn == true) {
            System.out.println("LOGGING IN");
        } else {
            System.out.println("LOGGING NOT");
        }
    }
}