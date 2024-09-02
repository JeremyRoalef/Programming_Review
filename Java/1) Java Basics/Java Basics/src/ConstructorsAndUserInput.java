public class ConstructorsAndUserInput {
    //Sample attributes to use with constructor
    private int x;
    private String message;

    //Constructors
    //Use a constructor to assign values to objects on object creation
    //see Examples.java for example

    //This constructor is called when the user enters an integer and message when called
    public ConstructorsAndUserInput(int x, String message){
        this.x = x; //'this' is used to refer to an object's own attributes
        this.message = message;
    }
    //This constructor is called when the user enters no parameters
    public ConstructorsAndUserInput(){
        this(100, "Goodbye"); //this calls the object's constructor that has two arguments
    }
    //this constructor is called when the user enters an integer
    public ConstructorsAndUserInput(int x){
        this(x, "Hello"); //this calls the object's constructor that has two arguments
    }
    //this constructor is called when the user enters a string
    public ConstructorsAndUserInput(String message){
        this(0, message); //this calls the object's constructor that has two arguments
    }

    //IGNORE FOR NOW
    public String toString(){
        String str = "Integer value: " + this.x;
        str += "\nMessage: " + this.message;
        return str;
    }
}
