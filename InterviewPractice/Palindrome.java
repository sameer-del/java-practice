package InterviewPractice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number 1 for number and 2 for string");
        int user = input.nextInt();
        if (user == 1) {
            System.out.println("enter a number to check palindrome");
            int numPali = input.nextInt();
            ispali(numPali);
        }
        if (user == 2) {
            System.out.println("enter a string to check palindrome");
            String strPali = input.next();
            ispali(strPali);
        }

    }

    static void ispali(int num) {
        int sum = 0;
        while (num > 0) {
            int temp = num % 10;
            sum = (sum * 10) + temp;
            num = num / 10;
        }
        if (num == sum) {
            System.out.println(sum + "it is a palindrome");
        } else {
            System.out.println("it is not a palindrome");

        }
    }

    static void ispali(String str) {
        int i = 0;
        int j = str.length() - 1;
        boolean isrev = true;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                isrev = false;
            }
            i++;
            j--;
        }
        if (isrev) {
            System.out.println(str + " " + "it is a palindrome");
        } else {
            System.out.println("it is not a palindrome");

        }
    }
}
