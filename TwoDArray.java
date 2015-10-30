/*
Christian Lapinig
clapinig@my.smccd.edu
CIS 254JA
Palindrome.java
Counts number of times the number 50 occured
Lab #22
10/30/2015
*/

import java.security.SecureRandom;

public class TwoDArray {
    public static void main( String[] args ) {
    	SecureRandom randomNumbers = new SecureRandom();
    	int rows=0;
    	int columns=0;
    	int number50 = 0;
	// what are you doing....
      if (args.length != 2) {
			System.out.println("Please Enter Only Two Arguments");
			System.exit(1);
		} try {
			rows = Integer.parseInt(args[0]);
			columns = Integer.parseInt(args[1]);
		} catch (NumberFormatException e) {
			System.out.println(e);
			System.exit(1);
		}
		if (rows <= 0 || columns <= 0 ) {
			System.out.printf(" Please Make Sure Your Arguments Are Greater Than 0");
			System.exit(1);
		}
		int array[][] = new int[rows][columns];
		for(int i=0;i<rows;i++) {
			for (int j=0;j<columns;j++) {
				array[i][j]=1+randomNumbers.nextInt(100);
				System.out.printf("%3d ",array[i][j]);
				if (array[i][j] == 50) number50 ++;
			}
			System.out.println();
		}
		System.out.printf("The Number 50 Ocured %d Amount of Times\nProgrammed By Christian Lapinig",number50 );
    }
}
