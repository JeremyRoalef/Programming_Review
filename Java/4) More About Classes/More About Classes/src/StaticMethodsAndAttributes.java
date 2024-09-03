public class StaticMethodsAndAttributes {
    /*
    Static Attributes
    Static attributes belong to a class, not an object (See Examples.java for examples).
    Syntax: AccessModifier static DataType variable;
     */
    public static int x = 5;


    /*
    Static Methods
    Static methods belong to a class, not an object (See Examples.java for examples).
    Syntax: AccessModifier static ReturnType method(){}
    */

    //create a static method
    public static void myStaticMethod(){
        System.out.println("This method is being accessed through the class, not an object");
    }
}