import java.util.Scanner;

/**
 *
 * @author 
 */
public class Main {

  //create method to generate random numbers and print asterisks
  public static void chaotic(int numOfLines){

    //create a for loop to repeat and generate random number of asterisks depending on the input number of lines by the user
    for(int i = 1; i <= numOfLines; i++){

      //formula to generate random numbers
      int randNum = (int)(Math.random() * (5 - 1 + 1)) + 1;

       //for loop to print random number of asterisks on a line
       for(int j = 1; j <= randNum; j++){
         System.out.print("*");
       }
       System.out.println("*");
    }
    
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);
    
    //ask user for the number of lines they would like to generate random asterisks and store it in a variable mentioned in the above parameter
    System.out.println("Enter the number of lines you would like to generate random asterisks");
    int numOfLines = input.nextInt();

    chaotic(numOfLines);

  }
}
