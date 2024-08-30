//Create Object of Type Random & Store It in a Variable
Random myRandomObject = new Random();

int x = 5;
//use myRandomObject Variable to Generate an Integer from 0 to x:
Console.WriteLine(myRandomObject.Next(0, x+1));  //x+1 includes x in the random generation

//use myRandomObject Variable to Generate a Floating-Point Number Between 0 and 1:
Console.WriteLine(myRandomObject.NextDouble());