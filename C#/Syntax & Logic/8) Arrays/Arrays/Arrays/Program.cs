const int ARRAYSIZE = 10;

//Arrays:
//DataType[] variableName = new DataType[ARRAYSIZE] {value1,value2,valuen};
//DataType[] variableName = new DataType[ARRAYSIZE];

int[] arrayOfIntegers = new int[ARRAYSIZE] {10,20,30,40,50,60,70,80,90,100};

//accessing Values in Arrays at a Given Index:
Console.WriteLine(arrayOfIntegers[0]);
Console.WriteLine(arrayOfIntegers[1]);
Console.WriteLine(arrayOfIntegers[2]);
Console.WriteLine(arrayOfIntegers[3]);
Console.WriteLine(arrayOfIntegers[4]);

//Using .Length() Method to Iterate Through Array:
for (int i = 0; i < arrayOfIntegers.Length; i++)
{
    Console.WriteLine("Index = " + i);
    Console.WriteLine("Value = " + arrayOfIntegers[i]);
}

Console.WriteLine("\n\n");

//Using ForEach Loop with Arrays:
//Takes the value at each index & uses that value
foreach (int i in arrayOfIntegers)
{
    Console.WriteLine("Value = " + i);
}

Console.WriteLine("\n\n");


//Passing Arrays as Arguments to Methods:
void myMethodUsingArrays(int[] numbers)
{
    foreach (int i in numbers)
    {
        Console.WriteLine(i);
    }
}
myMethodUsingArrays(arrayOfIntegers);

Console.WriteLine("\n\n");

const int NUMBEROFROWS = 4;
const int NUMBEROFCOLUMNS = 5;
//2D Arrays:
//DataType[,] variableName = new DataType[NUMBEROFROWS,NUMBEROFCOLUMNS];
int[,] twoDimensionalArray = new int[NUMBEROFROWS, NUMBEROFCOLUMNS]
{
    {1,2,3,4,5},                //Row 1
    {10,20,30,40,50},           //Row 2
    {100,200,300,400,500},      //Row 3
    {1000,2000,3000,4000,5000}  //Row 4
};

//Using .GetLength(i) Method to Get the Length of Rows or Columns
Console.WriteLine("# of Rows: " + twoDimensionalArray.GetLength(0));    //Returns the Number of Rows
Console.WriteLine("# of Columns: " + twoDimensionalArray.GetLength(1));    //Returns the Number of Columns

Console.WriteLine("\n\n");

//Using ForEach Loop in 2D Arrays:
foreach (int i in twoDimensionalArray)
{
    Console.WriteLine("Value = " + i);
}