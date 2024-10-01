// Base class

import java.util.Scanner;

class Arithmetic {
    int num1, num2;

    // creating a  Constructor 
    public Arithmetic(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }
}

// Derived class for Addition
class Addition extends Arithmetic {
    public Addition(int a, int b) {
        super(a, b); 
    }
    //void means there is no return value
    public void add() {
        //add a two integers
        System.out.println("Addition: " + (num1 + num2));
    }
}

// Derived class for Subtraction
class Subtraction extends Arithmetic {
    public Subtraction(int a, int b) {
        super(a, b);
    }

    public void subtract() {
        System.out.println("Subtraction: " + (num1 - num2));
    }
}

// Derived class for Multiplication
class Multiplication extends Arithmetic {
    public Multiplication(int a, int b) {
        super(a, b);
    }

    public void multiply() {
        System.out.println("Multiplication: " + (num1 * num2));
    }
}

// Derived class for Division
class Division extends Arithmetic {
    public Division(int a, int b) {
        super(a, b);
    }

    public void divide() {
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("try to do yourself😂");
        }
    }
}

// Main class to test the hierarchy
public class Arithmetics {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int a = input.nextInt();
        System.out.println("enter a number");
        int b = input.nextInt();

        // Performing addition
        Addition add = new Addition(a, b);
        add.add();

        // Performing subtraction
        Subtraction sub = new Subtraction(a, b);
        sub.subtract();

        // Performing multiplication
        Multiplication mul = new Multiplication(a, b);
        mul.multiply();

        // Performing division
        Division div = new Division(a, b);
        div.divide();
    }
}
