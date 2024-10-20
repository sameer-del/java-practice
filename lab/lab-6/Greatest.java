import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        // Scanner to get the element from the user
        Scanner input = new Scanner(System.in);
        // ask the user to define the array size to sorted without using sort method
        System.out.println("enter a size of the array :");
        int size = input.nextInt();
        // creating a array with user's array size
        System.out.println("enter a " + size + "element:");
        int[] arr = new int[size];
        // for loop for getting one by one element of the array
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        // don't forget to close the scanner or else it throws a error
        input.close();
        // passing the arr to the greatets method
        int greatestNum = greatest(arr);
        // printing the greatest number of elements
        System.out.println(greatestNum);
    }

    static int greatest(int[] arr) {
        int ans = arr[0];
        for (int num : arr) {
            if (num > ans) {
                ans = num;
            }
        }
        return ans;
    }
}
