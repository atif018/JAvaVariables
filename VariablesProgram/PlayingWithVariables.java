/* The purpose of this program is to show working knowledge of how variables
 * are initialized, used and manipulated. Users are also asked to provide 
 * inputs which are then used to carry out different functions.*/
 
import java.util.Scanner;

public class PlayingWithVariables

{
    
    public static void main(String[] args)
    
    {
        
        run(); // Run "run" method.
        
    }
    
    public static void run() // "Run" method.
    
    {
        
        int getNumber = 0; // A variable used to store values for many of the functions in the program and the value input by the user.
        final double halveVariable = 0.5; // A constant that is used to calculate half the value stored in a variable.
        double getNumberHalf = 0; // A variable that will store half the value stored in getNumber.
        int getNumberMod; // Will store the value when calculating the modulus.
        double rootOfGetNumber; //  Will store the value when getting the root of getNumber.
        double squareOfGetNumber; // Will store the value when getting the square of getNumber.
        String getName; // Will store the value input by the user when their name is input.
        
        Scanner input = new Scanner(System.in); // Initialise Scanner
        
        while (getNumber < 1 || getNumber > 9) // This While loop checks if the number input by user is between 1 and 9. If it is, the program continues. If it isn't, the user will be asked to put in another number.
        {
            System.out.println("Please enter any number between 1 and 9: ");
            getNumber = input.nextInt(); // Stores number input by user.
        }
        
        System.out.println("The number you typed was: " + getNumber);
        System.out.println("Your number multiplied by 3 is: " + (getNumber * 3));
        getNumber++; // Increments getNumber by 1
        System.out.println("Your number incremented by 1 is: " + getNumber);
        getNumber--; // Decrements getNumber by 1.
        getNumber--; // Decrements getNumber by 1.
        System.out.println("Your number decremented by 1 is: " + getNumber);
        getNumber++; // Increments getNumber to get back to original value.
        getNumber = getNumber + 10; // Increments getNumber by 10.
        System.out.println("Your number incremented by 10 is: " + getNumber);
        getNumber = getNumber - 10; // Decrements getNumber by 10 to get back to original value.
        getNumberHalf = getNumber * halveVariable; // getNumber is halved and then stored in new variable.
        System.out.println("Your number halved is: " + getNumberHalf);
        getNumberMod = getNumber; // New variable stores getNumber value.
        getNumberMod = 10 % getNumberMod; // Calculates modulus
        System.out.println("The Modulus of 10 by your number is: " + getNumberMod);
        rootOfGetNumber = Math.sqrt(getNumber); // Calculates square root of getNumber.
        System.out.println("The square root of your number is: " + rootOfGetNumber);
        squareOfGetNumber = Math.pow(getNumber, 2); // Calculates getNumber value squared.
        System.out.println("Your number squared is: " + squareOfGetNumber);
        
        System.out.println("Please enter your name: "); // Asks user for name.
        getName = input.next(); // Stores name in getName variable.
        char firstLetterOfName = getName.charAt(0); // Gets first letter of name.
        int getNameLength = getName.length(); // Finds length of string to find last letter.
        char lastLetterOfName = getName.charAt(getNameLength - 1); // Gets last letter of name.
        System.out.println("The first letter of your name is: " + firstLetterOfName + " and the last letter of your name is: " + lastLetterOfName);
        System.out.println("We will use the term \"United Kingdom\" in the following example.");
        String countryName = "United Kingdom"; // Stores String in new variable.
        String firstWord = countryName.substring(0, 6); // Substring returns first word of countryName.
        System.out.println("Extracting the first word gives: " + firstWord);
        String secondWord = countryName.substring(7); // Substring returns second word of countryName.
        System.out.println("Extracting the second word gives: " +secondWord);
    }
    
}