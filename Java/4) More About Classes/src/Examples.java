public class Examples {
    public static void main(String[] args){

        //See StaticMethodsAndAttributes.java for class

        //Call a static method from a class
        StaticMethodsAndAttributes.myStaticMethod();

        /*
        Below is an incorrect way of calling a static method that will result in a syntax error

        //create object of type StaticMethods
        StaticMethods staticMethods = new StaticMethods();

        //call static method
        staticMethods.myStaticMethod(); //Syntax error, because the method
                                        //does not belong to the object
         */

        //Call a static attribute from a class
        System.out.printf("Old value of static attribute: %d%n",StaticMethodsAndAttributes.x);
        //Change the value of the static method
        StaticMethodsAndAttributes.x = 1;
        System.out.printf("New value of static attribute: %d%n",StaticMethodsAndAttributes.x);

        System.out.println();

        /*
        The Math Class
        The Math class has many static methods to perform calculations provided below:
        Math.abs(x) -> Returns the absolute value of x
        Math.ceil(x) -> Rounds x up to the next integer
        Math.floor(x) -> Rounds x down to the next integer
        Math.exp(x) -> Raises the constant e to the power of x (e^x)
        Math.log(x) -> Natural logarithm of x ( ln(x) or log_e(x) )
        Math.max(x,y) -> Returns the greater value between x and y
        Math.min(x,y) -> Returns the lesser value between x and y
        Math.pow(x,y) -> Raises x to the power of y (x^y)
        Math.sqrt(x) -> The square root of x
        Math.sin(x) -> Sine of x in radians
        Math.cos(x) -> Cosine of x in radians
        Math.tan(x) -> Tangent of x in radians
        */

        System.out.println("Using the Math class:");

        System.out.printf("the absolute value of -5 is %d%n", Math.abs(-5));
        System.out.printf("6.2 rounded up is %f%n", Math.ceil(6.2));
        System.out.printf("6.2 rounded down is %.2f%n", Math.floor(6.2));
        System.out.printf("e to the power of 4 is %.2f%n", Math.exp(4));
        System.out.printf("the natural logarithm of 1 is %.2f%n", Math.log(1));
        System.out.printf("the greater value between 2 and 3 is %d%n", Math.max(2,3));
        System.out.printf("the lesser value between 2 and 3 is %d%n", Math.min(2,3));
        System.out.printf("2 to the power of 4 is %.0f%n", Math.pow(2,4));
        System.out.printf("the square root of 25 is %.0f%n", Math.sqrt(25));
        System.out.printf("the sine of 90 radians is %.2f%n", Math.sin(90));
        System.out.printf("the cosine of 90 radians is %.2f%n", Math.cos(90));
        System.out.printf("the tangent of 90 radians is %.2f%n", Math.tan(90));

        System.out.println();
        System.out.println();
        System.out.println();

        //See OverloadedMethods.java for class
        //Call each overloaded method
        OverloadedMethods.myMethod(); //Calls the method with no parameter
        OverloadedMethods.myMethod(1); //Calls the method with 1 parameter
        OverloadedMethods.myMethod(1, "Hello"); //Calls the method with int, then string parameter
        OverloadedMethods.myMethod("Hello", 1); //Calls the method with string, then int parameter

        System.out.println();
        System.out.println();
        System.out.println();

        //See ObjectsInMethods.java for class
        //Using objects in methods

        //Create Object object
        Object object = new Object();
        //Display its attribute's value
        System.out.printf("Old object's value: %d%n", object.x);

        //Use changeObject method in ObjectsInMethods class to change the object's value
        ObjectsInMethods.changeObject(object); //takes the object and changes its value to 10
        //Display the new object's value
        System.out.printf("New object's value: %d%n", object.x);

        //Display current object's value:
        System.out.printf("Current object: %s%n", object.toString());
        //Change what object our variable is pointing to using pointToObject method in ObjectsInMethods class
        object = ObjectsInMethods.pointToObject(); //Pay attention to the @ value
        //Show the variable is pointing to a different object
        System.out.printf("New object: %s%n", object.toString()); //Notice how the value after the @ changes
    }
}