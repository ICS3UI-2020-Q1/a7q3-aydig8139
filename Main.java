import java.util.Scanner;

/**
 *
 * @author 
 */
public class Main {

  public static void chaotic(int randNum){
    int randNum = (int)(Math.random() * (5 - 1 + 1)) + 1;
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    
    System.out.println("enter number");
    int randNum = input.nextInt;

    while (randNum <= 5){
      System.out.println("*");
    }

    chaotic(randNum);


  }
}
