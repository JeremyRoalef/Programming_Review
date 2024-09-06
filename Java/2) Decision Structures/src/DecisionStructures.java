public class DecisionStructures {

    public static void main(String[] args) {
        //If Statements
        if (true){
            System.out.println("Condition is true");
        }
        //alternative way to write an if statement (Only works with one line of code!)
        if (true)
            System.out.println("Alternative if-statement");

        //If-Else Statements
        if (false){
            System.out.println("Condition is true");
        }
        else{
            System.out.println("Condition is false");
        }
        //If-Else If-Else Statements
        if(false){
            System.out.println("Condition is true");
        }
        else if (true){
            System.out.println("First condition was false, but this condition is true");
        }
        else{
            System.out.println("No other condition was true");
        }

        //Switch statements
        int x = 2;
        switch (x){
            case 1:
                System.out.println("variable is equal to 1");
                break;
            case 2:
                System.out.println("Variable is equal to 2");
                break;
            case 3:
                System.out.println("Variable is equal to 3");
                break;
            default:
                System.out.println("Variable is not equal to any other value");
        }

        //Conditional Operator (?)
        //var x = (expression)? valueIfTrue: valueIfFalse
        int y = (true)? 3:5;
        System.out.println(y);
        //Same as below
        if (true)
            y = 3;
        else
            y = 5;
        System.out.println(y);
    }
}