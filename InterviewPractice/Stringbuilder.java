package InterviewPractice;

import java.lang.StringBuilder;
import java.util.Scanner;

public class Stringbuilder {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        String name = input.next();

        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        if (sb.toString().toLowerCase().equals(name.toLowerCase())) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }

    }
}