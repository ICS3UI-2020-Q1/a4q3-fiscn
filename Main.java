import java.util.Scanner; 

/**
 * Write a program that will prompt the user to enter in a positive integer. It will then calculate the sum from 1 up to that number.
 * @author Neil Fischer
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create scanner for user input 
    Scanner input = new Scanner(System.in); 
    //prompt the user to enter in a integer 
    System.out.println("Please enter an integer to count down to"); 

    int userNum = input.nextInt(); 
    int count = 1;
    // the accmulator to add the count into 
    int total = 0; 

    while(count <= userNum){ 
     total = total + count;  
     count = count + 1;

    } 
    System.out.println("The sum from 1 - " + userNum + " is " + total);
    
    
  }
}
