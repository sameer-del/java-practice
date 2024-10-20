
import java.util.Scanner;
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner to get the element from the user
		Scanner input = new Scanner(System.in);
		//ask the user to define the array size to sorted without using sort method
		System.out.println("enter a size of the array :");
		int size = input.nextInt();
		//creating a array with user's array size
		System.out.println("enter a "+ size + "element:");
		int[] arr = new int[size];
		// for loop for getting one by one element of the array 
		for(int i=0; i<size;i++) {
			arr[i] = input.nextInt();
		}
		//don't forget to close the scanner or else it throws  a  error
		input.close();
		//passing the arr to the sorting method
		sorting(arr);
		//printing the all value of the array
		for(int num:arr) {
			System.out.print(num + " ");
		}

	}
	public static void sorting(int[] arr) {
		//taking the length of the array
		int n = arr.length;
		//approach with two pointer method first for loop is for outer loop
		for(int i =0;i<n-1;i++) {
			//this loop for the inner loop that compare the elements
			for(int j=0;j<n-i-1;j++) {
				//it compares the current element and another element to find the greater number
				if(arr[j]>arr[j+1]) {
					//if it find it swap the number
					int temp = arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
				}
			}
		}
	}

}
