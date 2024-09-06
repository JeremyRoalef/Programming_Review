//Example of Aggregation
//A region will have a building, but the region does not own the building (Building exists with or without the region)

import java.util.ArrayList;
import java.util.List;

public class Region {
    //The region will have a list of buildings
    int numberOfBuildings;
    List<Building> buildings = new ArrayList<Building>();

    public Region(Building[] buildings){
        this.numberOfBuildings = buildings.length; //Initialize integer variable
        for (int newBuilding = 0; newBuilding < buildings.length; newBuilding++){ //loop through each building that will be added to the region
            this.buildings.add(buildings[newBuilding]); //Buildings are created outside the class and referenced in the region. This is aggregation
        }
    }

    public String toString(){
        String str = "";
        for (int building = 0; building < buildings.size(); building++){
            str += "Building " + (building+1) + "\n" + buildings.get(building).toString() + "\n";
            if (building == buildings.size()-1){
                str += "\n";
            }
            else{
                str += "\n\n";
            }
        }
        return str;
    }
}
