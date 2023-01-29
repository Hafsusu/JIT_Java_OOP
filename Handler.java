import java.util.Scanner;

public class Handler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Enter the first nuumber: ");
			int num1 = scan.nextInt();
			System.out.println("Enter the second number: ");
			int num2 = scan.nextInt();
			System.out.println("The result of the division is "+ num1/num2);
		}
		catch(Exception e){
			System.out.println("Can not divide by zero!!");	
		}
		int[] arr= {1, 2, 3, 4};
		try {
			for(int i = 0; i < 4; i++) {
				System.out.println(arr[5]);
			}
				
		}
		catch(Exception ex) {
			System.out.println("Array out of bound!!");
		}

	}

// Written by : Sofia Alemu - RU3049/13
//              Sumeya Abesha - RU0020/13
