int intNum = 10;
double doubleNum = 2.5;
float floatNum = 1.7f;
decimal decimalNum = 3.5m;

//Mathematical Operators:
// + (Add)
// - (Subtract)
// * (Multiply)
// / (Divide)
// % (Integer Divide & take the remainder)

Console.WriteLine(intNum + intNum);                 //combining an integer with an integer
Console.WriteLine(intNum % 3);                      //10/3 = 3 remainder 1, result is 1.
Console.WriteLine(intNum - doubleNum);              //integer is converted to a double & result is a double
Console.WriteLine(intNum * floatNum);               //integer is converted to a float & result is a float
Console.WriteLine(intNum / decimalNum);             //integer is converted to a decimal & result is a decimal

Console.WriteLine(doubleNum + floatNum);            //float is converted to a double & result is a double
Console.WriteLine(doubleNum - (double)decimalNum);  //double or decimal must be converted to the other
                                                    //for operation to work
Console.WriteLine(floatNum * (float)decimalNum);    //float or decimal must be converted to the other
                                                    //for operation to work

Console.WriteLine("\n\n");


//Combined Assignment Operators:
// +=
// -=
// *=
// /=
// %=

double combinedAssignment = 15;

combinedAssignment += 10;   //combinedAssignment = combinedAssignment + 10 (15+10)
Console.WriteLine(combinedAssignment);

combinedAssignment -= 10;   //combinedAssignment = combinedAssignment - 10 (25-10)
Console.WriteLine(combinedAssignment);

combinedAssignment *= 10;   //combinedAssignment = combinedAssignment * 10 (15*10)
Console.WriteLine(combinedAssignment);

combinedAssignment /= 10;   //combinedAssignment = combinedAssignment / 10 (150/10)
Console.WriteLine(combinedAssignment);

combinedAssignment %= 2;    //combinedAssignment = combinedAssignment % 2 (15%2)
Console.WriteLine(combinedAssignment);