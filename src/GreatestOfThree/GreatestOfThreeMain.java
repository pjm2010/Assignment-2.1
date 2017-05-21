package GreatestOfThree;

import java.util.Scanner;

public class GreatestOfThreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter three number please");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		scan.close();
		
		GreatestOfThree got=new GreatestOfThree();
		int greatest=got.compareFuntion(a, b, c); //Calling the function to get the greatest of the three number
		
		
		System.out.println("The greatest of the three numbers is "+greatest);
		
		
	}

}
