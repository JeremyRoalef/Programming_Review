public class Examples {
    public static void main(String[] args){
        //creating ConstructorsAndUserInput objects for demonstration

        //create object with no arguments given
        ConstructorsAndUserInput noArgument = new ConstructorsAndUserInput();
        //Display the object's values
        System.out.printf("Object with no arguments given:\n%s\n", noArgument.toString());

        //Create an object with an integer given
        ConstructorsAndUserInput integerArgument = new ConstructorsAndUserInput(15);
        //Display the object's values
        System.out.printf("Object with integer argument give:\n%s\n", integerArgument.toString());

        //Create an object with string given
        ConstructorsAndUserInput stringArgument = new ConstructorsAndUserInput("Hello World!");
        //Display the object's values
        System.out.printf("Object with string argument given:\n%s\n", stringArgument.toString());

        //Create an object with an integer and string argument given
        ConstructorsAndUserInput integerAndStringArgument = new ConstructorsAndUserInput(90, "Hi");
        //Display the object's values
        System.out.printf("Object with integer and string argument given:\n%s\n", integerAndStringArgument.toString());
    }
}
