import java.math.BigInteger; // Import the Big Integer class to handle bigger numbers
import java.util.Scanner;    // Import the Scanner class to get input from the user
import java.io.FileWriter;   // Import the FileWriter class to write the file
import java.io.IOException;  // Import the IOException class to handle errors

public class BEC {

    public static void main(String[] args) {
        try {
          
          Scanner in = new Scanner(System.in);

          // File Setup
          System.out.println("Insert file name:");
          String fileName = in.nextLine();
          FileWriter myWriter = new FileWriter(fileName + ".txt");
            
          // Number Setup
          BigInteger base;
          System.out.println("Enter base:");
          base = in.nextBigInteger();  
          System.out.println("Enter exponent:");
          int exponent = in.nextInt();

          // Calculation and Output
          BigInteger result;
          result = base.pow(exponent);
          String answer = String.valueOf(result);
          myWriter.write(answer);
          myWriter.close();
          System.out.println("File successfully created: " + fileName + ".txt");

        } catch (IOException e) {

          // Error
          System.out.println("An error occurred.");
          e.printStackTrace();

        }
    }
}