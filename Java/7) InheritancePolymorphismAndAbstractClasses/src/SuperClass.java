//Super Class will 'extend' its attributes and methods to any class that inherits it
//By making the SuperClass abstract, you cannot create an instance of the class.
//You can make instances of the subclasses that inherit its attributes and methods
public class SuperClass {
    private int x;
    private int y;
    private int z;

    public SuperClass(){} //Super Class MUST HAVE A NO-ARGUMENT CONSTRUCTOR
    public SuperClass(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //set getters and setters with the protected access modifier
    //Protected access modifier: attribute/method is accessible to current class and any subclasses, but not to anything else
    protected int getX(){return this.x;}
    protected int getY(){return this.y;}
    protected int getZ(){return this.z;}

    public String toString(){
        String str = "";
        str += "x = " + this.x + "\ny= = " + this.y + "\nz = " + this.z;
        return str;
    }
}
