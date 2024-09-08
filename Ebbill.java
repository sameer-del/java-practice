import java.util.Scanner;
public class Ebbill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //first of all we need a previous units
        System.out.print("enter the previous units");
        Double lastUnit = input.nextDouble();
        //first of all we need a previous units
        System.out.print("enter the previous units");
        Double currentUnit = input.nextDouble();

        //to calculatew the unit we consumed 
        Double usedUnit =currentUnit - lastUnit;
        //method to calculate the current bill
        AmountBill(usedUnit);
    }
     static void AmountBill(Double  usedUnit){
        //current price according to the unit 
        double first100 = 4.6; 
        double RemainingUnits = 5.5;
        //INITIAL VALUE TO CALCULATE THE CURRENT BILL
        double amount =0.0;
        //CONDITION TO CHECK THE UNIT ARE RUN UNDER THE 100 OR ABOVE TO CALCULATE THE PRICE
        if(usedUnit <=100){
            amount = usedUnit * first100;
            System.out.println(amount);
        }else{
             amount = 100 * first100 + (usedUnit - 100) * RemainingUnits;
            System.out.println(amount);
        }
     }
}
