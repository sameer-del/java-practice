
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//WAP to descending order array using sort() method
public class Descending {

	public static void main(String[] args) {

		// Scanner to get the element from the user
		Scanner input = new Scanner(System.in);
		// ask the user to define the array size
		System.out.println("enter a size of the array:");
		// creating a array with user's array size
		int size = input.nextInt();
		System.out.println("enter a value" + size + " ");
		Integer[] arr = new Integer[size];
		// for loop for getting one by one element of the array
		for (int i = 0; i < size; i++) {
			arr[i] = input.nextInt();

		}
		// don't forget to close the scanner or else it throws a error
		input.close();

		Arrays.sort(arr, Collections.reverseOrder());
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

}
