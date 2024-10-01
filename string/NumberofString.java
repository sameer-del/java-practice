import java.util.Scanner;
public class NumberofString {
    //program starts
    public static void main(String[] args) {
         //scanner used to get the input to the user 
         Scanner input = new Scanner(System.in);
         //this line display on terminal it makes user to enter the correct inputs
         System.out.println("enter the string :");
         //stroring the user input in the varaiable str 
         String str = input.nextLine();
         //it prints the return value of method called countstring 
         System.out.println(CountString(str));
    }
    //the method to count the string 
    public static int CountString(String str) {
        //the variable to count the string 
        int count = 0;
        //for loop to iterate the each charcter in the string 
        for(int i=0; i<str.length(); i++){
           /*after each iteration the count is increemneted and the loop runs an second index it goes all the way to the end of the string 
           beacuse  we give string to the length  */
            count++;
        }
        //it return sthe coubt vakues to the main method
        return count;
    }
}
