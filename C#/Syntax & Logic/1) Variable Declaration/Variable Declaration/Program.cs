//Variables are declared using the either form:
//DataType variableName;
//DataType variableName = value;

//variables cannot be used until they are assigned a value


//Integers
int int0;
int int1 = 1;
int int2 = 10;
int int3 = -10;

Console.WriteLine(int1 + "\n" + int2 + "\n" + int3 + "\n\n");


//Doubles (up to 15 decimal places)
double double0;
double double1 = 1;
double double2 = 1.97;
double double3 = 1.31240598213495129; //decimal places after the 15th are removed & not rounded

Console.WriteLine(double1 + "\n" + double2 + "\n" + double3 + "\n\n");


//Decimals (up to 28 decimal places)
decimal decimal0;
decimal decimal1 = 1;
decimal decimal2 = 1.90M;
decimal decimal3 = 1.21459395720358934572359823598M; //decimals in this form are rounded up

Console.WriteLine(decimal1 + "\n" + decimal2 + "\n" + decimal3 + "\n\n");


//Floats (up to 7 decimal places)
float float0;
float float1 = 1f;
float float2 = 1.9f;
float float3 = 1.92357248f; //floats in this form are rounded up

Console.WriteLine(float1 + "\n" + float2 + "\n" + float3 + "\n\n");


//Booleans
bool isBool;
bool isTrue = true;
bool isFalse = false;

Console.WriteLine(isTrue + "\n" + isFalse + "\n\n");


//Strings
string str0;
string str1 = "Hello World!";
string str2 = "123.456";

Console.WriteLine(str1 + "\n" + str2 + "\n\n");