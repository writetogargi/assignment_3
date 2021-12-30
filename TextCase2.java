package basics;
import java.util.Scanner;

public class TextCase2 {

	
	public static void main(String[] args) {
		
		System.out.println("Enter the number of denominations:");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int []denomination = new int[size];
		
		System.out.println("Enter"+" " +size +" "+ "denominations");
		for(int i = 0; i< size;i++) {
		
		Scanner input1 = new Scanner(System.in);
		int deno = input1.nextInt();
		denomination[i]=deno;
		
		}
		
		for(int i = 0; i < size;i++) {
			for(int j = i+1; j< size; j++) {
				if(denomination[i] < denomination[j]) {
					int temp = denomination[i];
					denomination[i] = denomination[j];
					denomination[j]=temp;
								
				}
				
			}
		}
			
		System.out.println("Denomination in Decreasing Order is as follows:");
		
		for(int k = 0; k < size; k++) {
			System.out.println(denomination[k]);
			
		}
			
		System.out.println("Enter Payable Amount:");
		Scanner amt = new Scanner(System.in);
		float amount = amt.nextFloat();
		float balance=amount;
		
		int minDeno = denomination[4];
		int counter;
		
		int []notes = new int[size];
		for(int k = 0; k < size; k++) {
				notes[k] = (int)balance/denomination[k];
				balance = balance - (notes[k]* denomination[k]);
				System.out.println("Denomination:"+" "+denomination[k]+" " +"No: of Notes:"+ " "+ notes[k]);
				
			}
		
			
		if(balance < minDeno) {
			System.out.println("Balance amount"+" " +(balance) +" " + " is less than minimum denomination");
			System.out.println("Further Payment is not possible:");
			
		}
				
			
			
			
		
					
				
			
		}
		
		

	}


