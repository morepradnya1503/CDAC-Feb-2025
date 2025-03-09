//Write a program that uses boolean literals to control program flow in an if-else statement.


public class BooleanLiteral{
	public static void main(String[] args){
		
		boolean Apple = true;
		if(Apple){
			System.out.println("in if block");
		}else {
			System.out.println("in another if block");
		}	
		
		boolean Pen = false;
		if (Pen){
		    System.out.println("pen is in if block of false ");
		}else{
		    System.out.println("Pen is in another block");
		
		}
	}
}