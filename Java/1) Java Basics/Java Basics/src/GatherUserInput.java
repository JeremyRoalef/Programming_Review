import java.util.Scanner; //import the scanner class to the file

public class GatherUserInput {
    public static void main(String[] args){
        //create an object of type Scanner
        Scanner userInput = new Scanner(System.in);

        //Use scanner to gather an integer value from the user
        System.out.printf("Enter a number: ");
        int myInteger = userInput.nextInt();
        //there is a bug with the nextInt() method where a \n at the end of the method is passed on.
        //To fix, call the scanner again to remove the \n for proper use
        userInput.nextLine();

        //Use scanner to gather a double value from the user
        System.out.printf("Enter a double: ");
        double my_double = userInput.nextDouble();
        //Same bug exists with the nextDouble() method
        userInput.nextLine();

        //Use scanner to get a string value from the user
        System.out.printf("Enter a message: ");
        String myMessage = userInput.nextLine();

        //Use scanner to get a character from the user
        System.out.printf("Enter a character: ");
        char myCharacter = userInput.next().charAt(0);

        //Display the user's input back to the user
        System.out.printf("Generating string...\n%s%d%c%f", myMessage,myInteger,myCharacter, my_double);
    }
}
