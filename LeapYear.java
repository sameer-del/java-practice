import java.util.*;
import java.util.Scanner;
class LeapYear{
    public static  void main(String[] args){
      Scanner in = new Scanner(System.in);
      int year = in.nextInt();
      if(year % 4 == 0){
         System.out.println("this year is leap year");
      }else{
         System.out.println("this year is not leap year");
      }

     }


   }