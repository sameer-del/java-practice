import java.util.Scanner;
public class AreaofTraingle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("to find the area of the triangle you have to say the base and height");
        System.out.println("base");
        double  base = input.nextDouble();
        
        System.out.println("height");
        double height = input.nextDouble();
        System.out.println(calculate(base,height));

       

    }
    public static double calculate(double b,double h){
        double area = (b * h) / 2;
        return area;
    }
    
}
