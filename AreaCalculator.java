class Shapesof {

 //constructor can be used multiple times but the same type of data types are not allowed it shows the error duplicate constructer
    Shapesof(double length, double breadth) {
        System.out.println("Area of Rectangle:" + (length * breadth));
    }

 
    Shapesof(double side) {
        System.out.println("Area of Square: " + (side * side));
    }

   
    Shapesof(float radius) {
        System.out.println("Area of Circle: " + (3.14159 * radius * radius));
    }
    Shapesof(double base,float height){
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}
    
    
public class AreaCalculator{
    public static void main(String[] args) {
        // Create objects to invoke the constructors

        // Area of Rectangle
        new Shapesof(10.0, 5.0);

        // Area of Square
        new Shapesof(4.0);  

        // Area of Circle
        new Shapesof(7.0f); 
        //area of triangle
        new Shapesof(6.0,8.0);

       
        
    }
}
