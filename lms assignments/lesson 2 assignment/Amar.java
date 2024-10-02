//"Amar" is HDFC bank customer his Balance is 25000. He deposited 15000 amount himself.
//After  some time He trasfered 11000 amount to his friend "Surya".
//Print the current balance and find interest value on that amount with interest value 2%  and 12months?
public class Amar {
    public static void main(String[] args) {
        String customer = "Amar";
        double balance = 25000;
        double deposit = 15000;
        balance += deposit;
        double transfer = 11000;
        balance -= transfer;
        int month = 12;
        double interest = 2.0 / 100;
        findinterest(balance, interest, month);
        System.out.println(customer + " " + "balance is " + balance);
    }

    public static void findinterest(double balance, double interest, int month) {
        double interestAmouunt = balance * interest * month / 12;
        System.out.println(interestAmouunt);
    }
}