import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a word to find palindrome");
        String word= in.nextLine();
        System.out.println(isPalindrome(word));       
     }
     public static boolean isPalindrome(String str){
        int i =0;
        int j= str.length()-1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)) {return false;}
            i++;
            j--;

        }
        return true;

     }
    
}
