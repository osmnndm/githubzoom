package github;

import java.util.Scanner;

public class Toplama {
	
	public static void main(String[] args) {
		
		// TOPLAMA
		
				Scanner scan = new Scanner (System.in);
			    int num1 = scan.nextInt();
			    int num2 = scan.nextInt();
			    
			   
			    System.out.println(num1+num2);

			    scan.close();
			    
			 // CIKARMA
				
				Scanner scan = new Scanner (System.in);
			    int num3 = scan.nextInt();
			    int num4 = scan.nextInt();
			    
			   
			    System.out.println(num3-num4);

			    scan.close();
		
		
	}

}
