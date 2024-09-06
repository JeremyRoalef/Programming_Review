public class ObjectsInMethods {

    //Sending objects as arguments to methods
    //See Examples.java for example
    public static void changeObject(Object object){ //Using Object class as an example
        //change object's attribute value
        object.x = 10;
    }

    //Return a pointer to an object
    public static Object pointToObject() {
        //create object
        Object object = new Object();

        //Return a pointer to this new objecct
        return object;
    }
}
