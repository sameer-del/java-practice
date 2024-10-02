import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number to reverse:");
        int num = input.nextInt();
        System.out.println(reversenum(num));
    }

    public static int reversenum(int num) {
        int rev = 0;
        while (num > 0) {
            int n = num % 10;
            num = num / 10;
            rev = rev * 10 + n;

        }
        return rev;
    }
}
