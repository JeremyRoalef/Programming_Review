//Call scanner class to get room dimensions
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);


        int numberOfRooms = 3;
        //Create building object
        Building building = new Building(numberOfRooms);

        //Generating room dimensions to set the room dimensions
        double[][] roomDimensions = new double[numberOfRooms][3];
        for (int room = 0; room < roomDimensions.length; room++){
            double tempLength;
            double tempWidth;
            double tempHeight;
            System.out.printf("Enter length of room %d: ", room+1);
            tempLength = input.nextDouble();
            input.nextLine();

            System.out.printf("Enter length of room %d: ", room+1);
            tempWidth = input.nextDouble();
            input.nextLine();

            System.out.printf("Enter length of room %d: ", room+1);
            tempHeight = input.nextDouble();
            input.nextLine();

            //store input in array
            roomDimensions[room][0] = tempLength;
            roomDimensions[room][1] = tempWidth;
            roomDimensions[room][2] = tempHeight;
        }

        System.out.println("Generating building...");
        //Send room dimensions to the building for setup
        building.setRooms(roomDimensions);
        System.out.printf("Building generated.%n%s", building.toString());

        //Delete the building (In so doing, deleting the rooms)
        System.out.println("Deleting the building...");
        building = null; //Removes all references to the building object, deleting it in the process
        System.out.println("Building deleted");

        //There is no way to access the building's rooms now, since they were owned by the building.
        //This is the effect of composition

        System.out.println();
        System.out.println();
        System.out.println();

        //generate buildings to send to a region object
        Building[] buildings = {new Building(3),new Building(7),new Building(6),new Building(1)};
        //Create a region with buildings in the region
        System.out.println("Generating Region...");
        Region region = new Region(buildings);
        System.out.printf("Region created. %n%s%n", region.toString());
        System.out.println("Deleting region...");
        region = null; //Removes all references to the region object, deleting it in the process
        System.out.println("Region deleted.");

        //You can still access the buildings from the buidings array; they were not deleted when the region was deleted.
        //This is the effect of aggregation.
        System.out.println("Accessing building that were in the region...");
        for (int newBuilding = 0; newBuilding < buildings.length; newBuilding++){
            System.out.printf("Building %d%n%s",(newBuilding+1),buildings[newBuilding].toString());
        }
    }
}