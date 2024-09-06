//SubClass1 "is a" SuperClass. It has all the properties and methods of the super class and more

public class SubClass1 extends SuperClass{
    //SubClass1 inherits attributes x, y, and z from SuperClass, but does not appear here.
    private String subClass1Attribute = "This belongs to SubClass1";

    public SubClass1(int x, int y, int z){
        super(x,y,z); //Call the superclass' constructor. Initializes the attributes from the super class
    }

    public String toString(){
        String str = "";
        str += super.toString() + "\n";
        str += subClass1Attribute;
        return str;
    }
}
