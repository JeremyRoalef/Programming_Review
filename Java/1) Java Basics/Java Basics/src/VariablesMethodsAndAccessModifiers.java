public class VariablesMethodsAndAccessModifiers {
    //Variable Declaration
    int my_integer = 1111111111; //Max size of an integer is 10 digits
    long my_long_number = 2133123143234567654L; //Max size of a long number is 19 digits
    float my_float = 1.321312f; //Can hold about 6-7 digits
    double my_double = 1.351234532456434; //Can hold about 15-16 digits
    String my_string = "Hello World!";
    char my_character = 'a'; //Must use single quotes ('')
    boolean my_boolean = true;

    //Access Modifiers
    public int my_public_integer = 1; //Accessible to other classes outside the class
    private int my_private_integer = 10; //Accessible only to the class it was declared
    protected int my_protected_integer = 90; //Accessible to class it was declared &
                                             // to inherited classes or classes inside the file

    //Methods
    //create a method that will return nothing when called
    void my_void_method(){
        System.out.println("This method does not return any value");
    }
    //Create a method that takes an integer as an argument
    void my_method_with_argument(int x){
        System.out.printf("This is the value entered: %d", x);
    }
    //Create a method that returns a data type
    int my_int_returning_method(){
        System.out.println("This method will return 10 when called");
        return 10;
    }
}
