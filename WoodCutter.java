/*
* determines the height of a wood board required to make a board foot from 
* a piece of wood with variable width and length.
*
* @author  Douglass Jeffrey
* @version 1.0
* @since   2020-11-30
* Class WoodCutter.
*/

// Import the Scanner
import java.util.Scanner;  

public class WoodCutter {


  /**
   * Function Calculates height from length and width inputs from main.
   */
  static float boardFoot(float length, float width) {
    
    // defines volume constant
    final float Volume = 144;
    
    // calculates height from length width and volume
    float height = Volume / (length * width);
    
    // returns height value
    return height;
  }

  /**
   * This function receives input from user and calls Boardfoot for the height.
   */
  public static void main(String[] args) {
    try {

      // Create scanner object
      Scanner scan = new Scanner(System.in);
      
      // receives length input
      System.out.println("Insert the length of the board (inches): ");
      float length = scan.nextFloat();
      
      // receives width input
      System.out.println("Insert the width of the board (inches): ");
      float width = scan.nextFloat();

      // receives information from BoardFoot.
      float calcHeight = boardFoot(length, width);

      // Outputing the rolled number.
      System.out.println("The height of the board foot with specified"
                         + " dimensions: " + calcHeight + " inches");
      
    //catches invalid inputs  
    } catch (Exception e) {
      System.out.println("Invalid input");
    }
  }
}
