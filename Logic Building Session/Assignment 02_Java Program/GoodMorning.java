/*Display Good Morning Message Based on Time: 

    Task: Create a flowchart to display a "Good Morning" message based on a given time. 
    Next Step: Write a Java program that displays a "Good Morning" message if the 
    predefined time is between 5 AM and 12 PM. Use an if statement to implement the logic. */

class GoodMorning{
             
            public static void main(String args[])
             {
                 int time = 10; //Predifine time is 10pm also write 14 goes to else statement
                 
                  //Check if time is between 5 AM and 12 PM
                   if (time >=5 && time <= 12) 
                    System.out.println("Good Morning");
                      
                   else 
                    System.out.println("It's not morning");

            }
}
  