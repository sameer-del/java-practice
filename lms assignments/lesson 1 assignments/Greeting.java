import java.util.Scanner;

//WAP for taking a name from the user and displaying a Welcome msg with the user name
public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a name:");
        String name = input.nextLine();
        System.out.printf("hi %s how are you,you look good day.", name);
    }
}
