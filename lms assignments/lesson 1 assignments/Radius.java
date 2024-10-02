//WAP for taking the string "YES" from the user till the user wants to find the area of a circle. here, the radius you have to take as input from the user.

import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("do you want to find the radius of the circle:");
        String operate = input.nextLine();
        String check = operate.toLowerCase();
        if (check.equals("yes")) {
            System.out.print("enter the radius of the circle:");
            int radius = input.nextInt();
            int area = radius * radius;
            System.out.println(area);
        } else {
            System.out.println("thank you");
        }

    }
}
