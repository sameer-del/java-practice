import java.util.Scanner;
public class Studentmarklist {
    public static void main(String[] args) {
        //scanner initialization
        Scanner input = new Scanner(System.in);
        //getting inputs from users
        System.out.println("enter a name: ");
        String name= input.nextLine();
        System.out.println("enter a rollno: ");
        int rollno = input.nextInt();
        System.out.println("enter a mark: ");
        int mark = input.nextInt();
        //create a method called evaluate and print the results
        evaluate(name, rollno, mark);
        
    }
    static void evaluate(String name, int mark, int rollno) {
        String grade = checkgrade(mark);
        String result = passfail(mark);
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(grade);
        System.out.println(result);

    };
    static String checkgrade(int mark){
        if(mark >=95){
            return "A+";
        } else if(mark >=90){
            return "A";
        } else if(mark >=80){
            return "B";
        }else if(mark >=70){
            return "C";
        } else if(mark >=50){
            return "D";
        } else{
            return "F";
        }
    }
    static String passfail(int mark){
        if(mark >=50){
            return "Pass";
        }else{
            return "Fail";
        }
    }

}
