

import java.util.Scanner;

public class FindingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner to get the element from the user
				Scanner input = new Scanner(System.in);
				//ask the user to define the array size
				System.out.println("enter a size of the array:");
				//creating a array with user's array size
				int size = input.nextInt();
				System.out.println("enter a value" + size + " ");
				int[] arr = new int[size];
				// for loop for getting one by one element of the array 
				for(int i=0;i<size;i++) {
					arr[i] = input.nextInt();
					
				}
				System.out.println("enter a number to find");
				int target = input.nextInt();
				//don't forget to close the scanner or else it throws  a  error
				input.close();
				
		int result = finding(arr,target);
		if(result == -1) {
			System.out.println("element not found");
		}else {
			System.out.println("element  found");
		}
	}
	public static int finding(int[] arr,int target) {
		
		for(int num:arr) {
			if(num == target) {
				return num;
				
			}
			
		}
		
		return -1;
	}

}
