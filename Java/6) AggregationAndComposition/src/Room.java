//The room class will be used in the building class. The room cannot exist outside of the building.

public class Room {
    //A room has a length, width, and height
    private double length, width, height;

    public Room(){
        this(0,0,0);
    }
    public Room(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength(){return this.length;}
    public double getWidth(){return this.width;}
    public double getHeight(){return this.height;}

    public void setLength(double length){this.length = length;}
    public void setWidth(double width){this.width = width;}
    public void setHeight(double height){this.height = height;}

    public String toString(){
        String str = "";
        str += "Length: " + this.length + "\n";
        str += "Width: " + this.width + "\n";
        str += "Height: " + this.height;
        return str;
    }
}
