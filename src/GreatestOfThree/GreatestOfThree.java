package GreatestOfThree;

public class GreatestOfThree {

	public int compareFuntion(int a,int b,int c){		//Function to return the greatest of three number
		
		int temp=0;
		
		if (a>b && a>c){
			temp= a;
			}
		else if(b>a && b>c){
			temp= b;
		}
		else if (c>a && c>b){
			temp= c;
		}
		
		return temp; //Returns the greatest integer to the function
	}
}
