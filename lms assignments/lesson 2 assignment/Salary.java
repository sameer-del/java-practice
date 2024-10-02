/*
write a java program to find given below employee allowances based on given salary
da  12%
hra 13%
pf 15%
gross  = salary with all allowances
to print all details of emp da,hra,pf,gross  */

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the basic salary of the employee: ");
        int salary = input.nextInt();
        // calculating the da hra pf
        double da = salary * 12 / 100;
        double hra = salary * 13 / 100;
        double pf = salary * 15 / 100;
        // calculating the gross
        double gross = salary + da + hra - pf;
        System.out.println("pf of the salary: " + pf);
        System.out.println("intiale salary : " + salary);
        System.out.println("da of the salary: " + da);
        System.out.println("hra of the salary: " + hra);
        System.out.println("gross of the salary: " + gross);
    }
}
