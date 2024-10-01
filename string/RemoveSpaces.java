import java.util.Scanner;
public class RemoveSpaces {
    public static void main(String[] args) {
          //scanner used to get the input to the user 
          Scanner input = new Scanner(System.in);
          System.out.print("enter the string to remove the white spaces:");
          //get the scanner value and store it in the str variable
          String str = input.nextLine();
          //method to remove the white spaces returns or print the string
          RemoveSpaces(str);    
    }
    public static void RemoveSpaces(String str){
        //this trim method will remove the spaces from the starting and ending spaces it didnt remove the words spaces

        /* String cleanedString = str.trim(); */

        //to remove the all spaces we have to use replace method to remove and replaces the not spacing
        String cleanedString = str.replaceAll("\\s", "");
        System.out.println(cleanedString);
    }
}
