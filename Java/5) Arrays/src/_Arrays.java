import java.util.Arrays;
import java.util.Random;

public class _Arrays {
    //create random object (For use with methods)
    static Random random = new Random();

    public static void main(String[] args) {

        //Create an array
        //DataType arrayName = new DataType[ARRAYSIZE]
        //DataType arrayName = {ValueInitializer}

        final int ARRAYSIZE = 10;
        int[] myIntegerArray = new int[ARRAYSIZE];

        //Add values to the array
        for (int x = 0; x < myIntegerArray.length; x++){
            myIntegerArray[x] = x*5;
        }
        //Use Arrays.toString() to display array values
        System.out.printf("Displaying values of array%n%s%n%n", Arrays.toString(myIntegerArray));

        //Using Enhanced for Statement with Arrays
        System.out.println("Adding values in the array...");
        int accumulator = 0;
        for (int x: myIntegerArray){
            accumulator += x;
        }
        System.out.printf("Values added.%nHeres the result: %d%n%n", accumulator);

        //Pass Arrays to Methods:
        System.out.println("Creating new array based off old array...");
        int[] newIntArray = passByValue(myIntegerArray);
        System.out.printf("Array Created.%n");
        //display myIntegerArray values and newIntArray values
        System.out.println(Arrays.toString(myIntegerArray));
        System.out.println();

        //Update myIntegerArray values
        System.out.printf("Current array: %s%nUpdating array...", Arrays.toString(myIntegerArray));
        updateArray(myIntegerArray); //adds 3 to each value in the array
        System.out.printf("Array updated.%nUpdated array: %s%n%n", Arrays.toString(myIntegerArray)); //original array changed

        System.out.println("Generating random integer array...");
        //Create array from method
        int[] generatedArray = generateRandomIntegers(10);
        //Display generated method
        System.out.printf("Array Created.%nHere's the array: %s%n%n", Arrays.toString(generatedArray));

        //Comparing arrays
        //Using '==' compared if the variable references point to the same object
        int[] array1 = {1,2,3};
        int[] array2 = array1;
        System.out.printf("Array1 object reference: %s%n", array1.toString());
        System.out.printf("Array2 object reference: %s%n", array2.toString());

        System.out.printf("Are arrays 1 and 2 pointing to the same object?%n%b%n", array1 == array2);

        //Create new array
        int[] array3 = {1,2,3};
        System.out.printf("Array 3 object reference: %s%n", array3.toString());
        System.out.printf("Does array 3 point to the same object as arrays 1 and 2? %n%b%n", array3 == array1);

        //Compare array values to test if they're equal (see compareIntegerArrays() method below)
        System.out.printf("Are the values in array 3 equal to the values in arrays 1 and 2?%n%b%n%n",
                compareIntegerArrays(array3,array1));

        //Create arrays of objects (Ex: String objects)
        String[] stringArray = {"Bobby", "Timmy", "Joey"};
        //Display string array
        System.out.printf("Here is a string array: %s%n", Arrays.toString(stringArray));
        //Distinguishing from the length attribute in arrays & length() method in strings
        //array.length returns the number of elements in the array
        //string.length() returns the number of characters in the string
        System.out.printf("This is the length of the array: %d%nThis is the length of the first string: %d%n%n%n%n",
                stringArray.length, stringArray[0].length());


        //Creating 2D Arrays (Nested Arrays/Arrays Inside Arrays/A Matrix)
        final int ROWS = 7;
        final int COLUMNS = 9;

        System.out.println("Creating integer matrix...");
        int[][] myIntegerMatrix = new int[ROWS][COLUMNS];
        //Arrays.toString method will display references to array objects in the matrix
        System.out.printf("Matrix created.%n%s%n", Arrays.toString(myIntegerMatrix));

        //Display the number of rows and columns in the array
        System.out.printf("Number of rows in the array: %d%nNumber of columns in the array: %d%n%n",
                myIntegerMatrix.length, myIntegerMatrix[0].length);

        System.out.println("Displaying the values in the array...");
        //Display values in the array
        for (int[] arrayRow: myIntegerMatrix){
            //Display contents in the array
            System.out.println(Arrays.toString(arrayRow));
        }
        System.out.println();

        System.out.println("Updating values in the array...");
        //Update values in the matrix
        for (int i = 0; i < myIntegerMatrix.length; i++){ //Iterates through rows
            for (int j = 0; j < myIntegerMatrix[i].length; j++){ //Iterates through columns
                //Update value at the given indices
                myIntegerMatrix[i][j] = i*j;
            }
        }
        System.out.println("Values updated.");
        //Display new values in the array
        for (int[] arrayRow: myIntegerMatrix){
            //Display contents in the array
            System.out.println(Arrays.toString(arrayRow));
        }
        System.out.println();

        //Get a row from the matrix
        int[] tempRow;
        System.out.println("Grabbing row 3 from the matrix...");
        tempRow = myIntegerMatrix[2]; //row 3 is at index 2
        System.out.printf("Row obtained.%n%s%n%n", Arrays.toString(tempRow));

        //Get a column from the matrix
        int[] tempColumn = new int[myIntegerMatrix.length];
        System.out.println("Grabbing column 5 from the matrix...");
        for (int i = 0; i < myIntegerMatrix.length; i++){ //iterate through the rows
            tempColumn[i] = myIntegerMatrix[i][4]; //Column 5 is at index 4
        }
        System.out.printf("Column obtained.%n%s%n", Arrays.toString(tempColumn));
    }

    //Pass-By-Value method (Original array is not changed)
    static int[] passByValue(int[] intArray){
        //Create new array from the parameter array
        int[] newArray = new int[intArray.length];
        //copy values to new array
        for (int x = 0; x < newArray.length; x++){
            newArray[x] = intArray[x] + 1;
        }

        //return the array
        return newArray;
    }

    //Pass-By-Reference method (Original array content is modified)
    static void updateArray(int[] intArray){
        //Add 3 to the array values
        for (int x = 0; x < intArray.length; x++){
            intArray[x] += 3;
        }
    }

    //Return array from method
    static int[] generateRandomIntegers(int SIZE) {
        //create new array
        int[] intArray = new int[SIZE];

        //initialize values in array
        for (int x = 0; x < intArray.length; x++) {
            intArray[x] = random.nextInt(0,100);
        }
        //return the reference to the array
        return intArray;
    }

    static boolean compareIntegerArrays(int[] array1, int[] array2){
        //If array lengths are different, arrays are not equal
        if (array1.length != array2.length){
            return false;
        }
        //Compare array1[0] to array2[0], and so on until arrays are empty
        else {
            for (int x = 0; x < array1.length; x++) {
                if (array1[x] != array2[x]){
                    return false; //Arrays are not equal at index x
                }
            }
            return true; //All values in the array are equal
        }
    }
}