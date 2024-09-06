public class Main {
    public static void main(String[] args) {
        //Attempt creation of an AbstractClass object
        //AbstractClass abstractClass = new AbstractClass(); -> since AbstractClass is abstract, you cannot make an object from it

        //Create an object of SubClass1
        System.out.println("Creating a SubClass1 object...");
        SubClass1 subClass1 = new SubClass1(1,2,3);
        System.out.printf("Object created.%n%s%n%n", subClass1.toString());

        //Create an object of SubClass2
        System.out.println("Creating a SubClass2 object...");
        SubClass2 subClass2 = new SubClass2(324,52,235);
        System.out.printf("Object created.%n%s%n%n", subClass2.toString());

        //Create an object of SubClass3
        System.out.println("Creating a SubClass2 object...");
        SubClass3 subClass3 = new SubClass3(380,901,532);
        System.out.printf("Object created.%n%s%n%n", subClass3.toString());

        System.out.println();

        //Polymorphism - allow an object to take the shape of many objects
        System.out.println("Creating polymorphic object...");
        SuperClass superClass; //create SuperClass variable
        System.out.println("Object created.");

        //make object point to SubClass1 object
        System.out.println("Making polymorphic object point towards SubClass1 object...");
        superClass = subClass1; //points superClass towards subClass1 object made above
        System.out.printf("Polymorphism complete.%n%s%n%n", superClass.toString());

        //make object point to SubClass2 object
        System.out.println("Making polymorphic object point towards SubClass2 object...");
        superClass = subClass2; //points superClass towards subClass2 object made above
        System.out.printf("Polymorphism complete.%n%s%n%n", superClass.toString());

        //make object point to SubClass3 object
        System.out.println("Making polymorphic object point towards SubClass1 object...");
        superClass = subClass3; //points superClass towards subClass3 object made above
        System.out.printf("Polymorphism complete.%n%s%n%n", superClass.toString());
    }
}