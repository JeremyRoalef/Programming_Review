//Example of Composition
//Composotion - "Has-a-and-owns" relationship
public class Building {
    //The building class will consist of rooms. These rooms cannot exist outside of the building; the building owns the rooms
    int numOfRooms;
    Room[] rooms;

    public Building(int numOfRooms){
        //initialize number of rooms
        this.numOfRooms = numOfRooms;
        //initialize array
        rooms = new Room[numOfRooms];

        //initialize rooms in the array
        for (int room = 0; room < numOfRooms; room++){
            rooms[room] = new Room(); //Rooms are created inside of the Building class. This is composition
        }
    }

    public void setRooms(double[][] roomDimensions){ //roomDimesions holds a matrix of room dimensions (length, width and height) for each room
        for (int roomRow = 0; roomRow < roomDimensions.length; roomRow++){
            double[] tempArray = roomDimensions[roomRow];
            rooms[roomRow].setLength(tempArray[0]); //gets the length from the array
            rooms[roomRow].setLength(tempArray[1]); //gets the width from the array
            rooms[roomRow].setLength(tempArray[2]); //gets the height from the array
        }
    }

    public String toString(){
        String str = "";
        str += "There are " + numOfRooms + " rooms in the building\n";
        for (int room = 0; room < rooms.length; room++){
            str += "Room " + (room+1) + " Dimensions:\n";
            str += rooms[room].toString();
            if (room == rooms.length-1){
                str += "\n";
            }
            else{
                str += "\n\n";
            }
        }

        return str;
    }
}