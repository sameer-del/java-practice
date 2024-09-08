import java.util.Scanner;
public class AddTwo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = num1 + num2;
        System.out.println("the sum is :" +num3);
    }
}