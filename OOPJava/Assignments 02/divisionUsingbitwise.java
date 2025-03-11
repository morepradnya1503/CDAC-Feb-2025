/*Q4:  Write a program to find whether a given number is  divisible by 3  without using the 
modulus (  %  ) or division (  /  ) operators. 
Hint  : Use  subtraction and bitwise shifts.*/

public class divisionUsingbitwise{
	public static void main(String[] args){
		int n = 15;
		
		
        // Convert the number to positive if it's negative
		if(n<0){
			n = -n; 
		}
		
        // Use bitwise operations and subtraction to check divisibility by 3
		while(n>3){
			n = (n & 3) + (n >> 2);// Reduce n by using bitwise operations
		}
		
		
        // Check if the result is 0 or 3, meaning the number is divisible by 3
		if(n==0 || n==3)
			System.out.println("Division by 3");
		else
			System.out.println("Not division by 3");
	
	}
}