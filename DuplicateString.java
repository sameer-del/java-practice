import java.util.Scanner;

public class DuplicateString {
   //program starts
        public static void main(String[] args) {
            //scanner used to get the input to the user 
           Scanner input = new Scanner(System.in);
           System.out.println("enter the string to find the duplicate:");
           //get the scanner value and store it in the str variable
           String str = input.nextLine();
           //after the variable values get it send to the function of FindDuplicate it is also called as method or function
        findDuplicates(str);
        }
        public static void findDuplicates(String str) {
            //creating a array to hold the each character of the string
           int[] count = new int[256];
           //this loop change the string to each character at char array to store in the array
           for(char c: str.toCharArray()){
            count[c]++;
           }
           //this loop check the array each value if the same value present one or more time it prints the value 
           for(int i=0; i<count.length; i++){
            if(count[i]>1){
                //type casting to array to char type to display
                System.out.println((char)i);
            }
           }
        }
        //method or function ends
        //program ends
    }
