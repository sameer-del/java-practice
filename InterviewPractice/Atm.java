package InterviewPractice;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        int balance = 100000, withdraw, deposit;
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("hi this is my atm machiine choose below options for the operartion");
            System.out.println("enter 1 to deposit the money");
            System.out.println("enter 2 to withdraw the money");
            System.out.println("enter 3 to check the balance ");
            System.out.println("enter 4 to exit");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("enter a amount to deposit the money");
                    deposit = input.nextInt();
                    balance = balance + deposit;
                    System.out.println("the amount" + deposit + " is deposited succesfully");
                    break;
                case 2:
                    System.out.println("enter a amount to withdraw the money");
                    withdraw = input.nextInt();
                    balance = balance - withdraw;
                    System.out.println("the amount" + withdraw + " is withdraw succesfully");
                    break;
                case 3:

                    System.out.println(balance + " is your balance");
                    break;
                case 4:
                    System.exit(choice);

            }
        }
    }
}
