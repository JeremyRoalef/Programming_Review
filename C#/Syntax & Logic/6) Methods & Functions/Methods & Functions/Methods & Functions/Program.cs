//Note: Private, Public, & Protected Access Modifiers Can Only Be Used in Classes
//Use "return;" to exit a method at any point in the method

//Void-Returning Methods:
void myVoidMethod()
{
    Console.WriteLine("This method does not return a value from where it was called.");
}
myVoidMethod();

//Value-Returning Methods:
int myIntReturningMethod()
{
    Console.WriteLine("This method will return a value of 1 from where it was called.");
    return 1;
}
int intNum = myIntReturningMethod();
Console.WriteLine(intNum);

//Methods With Parameters:
void myMethodWithParameters(int param1, double param2)
{
    Console.WriteLine("Parameter 1 value is " + param1 + ".\nParameter 2 value is " + param2);
}
myMethodWithParameters(1,1.34);
myMethodWithParameters(param1: 7, param2: 1.99);    //specify which parameter gets what value

//Default Values Given to Methods:
void myMethodWithDefaultParameters(int num1 = 4, int num2 = 9)
{
    Console.WriteLine("num1 value is " + num1 + ".\nnum2 value is " + num2);
}
myMethodWithDefaultParameters();
myMethodWithDefaultParameters(1);
myMethodWithDefaultParameters(1,5);