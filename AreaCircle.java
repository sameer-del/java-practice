import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius of the circle:");
        double r = input.nextDouble();
        double Area = Math.PI * Math.pow(r,2);
        System.out.println(Area);

    }
}
