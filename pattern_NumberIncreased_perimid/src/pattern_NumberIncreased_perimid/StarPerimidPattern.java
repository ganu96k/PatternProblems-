package pattern_NumberIncreased_perimid;

import java.util.Scanner;


// main  logic 

public class StarPerimidPattern {

	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number  want to print star ");
		
		int n = sc.nextInt();
		
		starPrint(n);

	}
	
	
	
// main method to call function and take argumnet 
	private static void starPrint(int n) {
		
		for (int i = 1 ; i<=n ; i++ ) {
			
			for(int j =1 ; j<=i ; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
