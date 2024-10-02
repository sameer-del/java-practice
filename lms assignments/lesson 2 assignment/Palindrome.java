import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number to find the palindrome: ");
        int num = input.nextInt();
        findPalindrome(num);

    }

    public static void findPalindrome(int num) {
        int rev = 0;
        int originalNum = num;
        while (num > 0) {
            int bal = num % 10;
            num = num / 10;
            rev = rev * 10 + bal;
        }

        if (rev == originalNum) {
            System.out.println("the number is palindrome");
        } else {
            System.out.println("the number is not palindrome");
        }
    }
}
