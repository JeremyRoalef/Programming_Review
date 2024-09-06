//Additional subclass to demonstrate polymorphism

public class SubClass3 extends SuperClass{

    private String subClass3Attribute = "This belongs to SubClass3";

    public SubClass3(int x, int y, int z){
        super(x,y,z);
    }


    public String toString(){
        String str = "";
        str += super.toString() + "\n";
        str += subClass3Attribute;
        return str;
    }
}
