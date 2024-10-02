import java.util.Scanner;

//WAP for adding, Subtracting, Multiplying, and dividing the two numbers and the input from the user
public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" pick a number to 1.sum 2.sub 3.division 4.multiply");
        int arithmetic = input.nextInt();
        System.out.print("enter a first digit:");
        int num1 = input.nextInt();
        System.out.print("enter a second digit:");
        int num2 = input.nextInt();

        switch (arithmetic) {
            case 1:
                System.out.println("the addition of the number is:" + " " + num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println("the addition of the number is:" + " " + num1 / num2);
                break;
            case 4:
                System.out.println("the addition of the number is:" + " " + num1 * num2);
                break;
            default:
                break;
        }
    }
}
