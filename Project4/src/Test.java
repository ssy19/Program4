import java.util.Scanner;

public class Test {

   public static void main(String[] args) {

       Set set = new Set(); //new set class object created
       System.out.println("Programming Fundamentals");
       System.out.println("NAME: Sofia Syed");
       System.out.println("PROGRAMMING ASSIGNMENT 4 - SET");
       System.out.println("");
       Scanner scan = new Scanner(System.in); //scanner object created
       String command, newLine;
       int i;
       while(true)
       {
           System.out.print("Enter command: "); //prompts user to input command
           newLine = scan.nextLine();
           String data[] = newLine.split(" "); //converts the command into array
           if(data[0].equalsIgnoreCase("add")) // add
           {
               try {
                   if(data.length > 1) //validating if data has been passed
                   {
                       i = Integer.parseInt(data[1]); //converting the data into an integer
                       set.add(i); // adds i to the set
                       System.out.println(set); //displays new data to user
                   }
               }catch(NumberFormatException e) {        	   
               }
           }
           else if(data[0].equalsIgnoreCase("del")) //deletes the specific value input
           {
               try {
                   if(data.length > 1) //validating if data has been passed
                   {
                       i = Integer.parseInt(data[1]); //converting the data into an integer
                       set.delete(i); // deletes i from the set
                       System.out.println(set); //displays new data to user
                   }
               }catch(NumberFormatException e) {
               }
           }
           else if(data[0].equalsIgnoreCase("exists"))
           {
               try {
                   if(data.length > 1) //validating if data has been passed
                   {
                       i = Integer.parseInt(data[1]); //converting the data into an integer
                       System.out.println(set.exists(i)); //displays i in the set if it exists
                   }
               }catch(NumberFormatException e) {
               }
           }
       }
   }
}
               
