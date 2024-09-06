//Create additional subclass to demonstrate polymorphism
public class SubClass2 extends SuperClass{

    private String subClass2Attribute = "This belongs to SubClass2";

    public SubClass2(int x, int y, int z){
        super();
    }

    public String toString(){
        String str = "";
        str += super.toString() + "\n";
        str += subClass2Attribute;
        return str;
    }
}
