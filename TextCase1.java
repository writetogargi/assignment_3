package basics;
import java.util.Scanner;

public class TextCase1 {

	public static void main(String[] args) {
		System.out.println("Enter the no of transactions:");
		Scanner input1 = new Scanner(System.in);
		int size = input1.nextInt();
		int ar[] = new int[size];
		
		System.out.println("Enter"+ " "+size +" "+ "inputs");
		for(int i = 0 ; i < size;i++) {
				
		Scanner input2 = new Scanner(System.in);
		int amount = input2.nextInt();
		ar[i] =	amount;
			
		}
		
		System.out.println("Enter the target");
		Scanner input3 = new Scanner(System.in);
		float target = input3.nextFloat();
		int sum=0;
		
		for(int k = 0; k < size; k++) {
			
			sum += ar[k];
						
			if(sum >= target) {
				System.out.println("Target Completed in transaction no:" + k);
				break;
			} 
				
			}
		if(sum < target) {
			System.out.println("Target Could not be met ");
		
		}
		
	}
	
}
