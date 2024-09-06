public class OverloadedMethods {

    /*
    Overloaded Methods
    Overloaded methods are methods that have the same name but different signature
    Parts of a method's signature:
    ->Method Name
    ->Parameter List and the Order of the Parameters
    */

    //Create methods with the same name, but different parameters
    //See Examples.java for example
    static void myMethod(){
        System.out.println("This method has no arguments");
    }
    static void myMethod(int x){
        System.out.println("This method has one argument that is of type integer");
    }
    static void myMethod(int x, String message){
        System.out.println("This methods has two arguments. The first is of type integer" +
                " and the second is of type string");
    }
    static void myMethod(String message, int x){
        System.out.println("This method has two arguments. The first is of type string " +
                "and the second is of type integer");
    }
}
