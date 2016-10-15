
import java.util.Scanner;

public class ReversingNumber {

	public static void main(String[] args){
		
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Output the prompt
		System.out.println("Enter numbers to reverse: ");
		
		//Wait for the user to enter numbers
		int firstValue = input.nextInt();

		// value that will be reversed
		int reversedNumber = 0;
		
		//Will continue to loop as long as input value is not 0
		while(firstValue > 0){
			//value2 is the remainder, value2 of 98765 is 5/6/7/8/9 
			int secondValue = firstValue % 10; 
			
			//This will break the loop 
			firstValue = firstValue / 10; 
			
			//Reverses the Number 5/56/567/5678/56789
			reversedNumber = reversedNumber*10 + secondValue; 
		}
		//Prints out the reverse number
		System.out.print(reversedNumber);
		
		input.close();
	}
	
}
