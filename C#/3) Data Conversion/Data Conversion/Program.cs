//Converting Numeric Data Types Between One Another:
//(DataType)variableName;

int intNum = 10;
double doubleNum = 10.2;
float floatNum = 1.5f;
decimal decimalNum = 2.123m;

Console.WriteLine("Integer before conversion: " + intNum + "\n");
Console.WriteLine("Integer Converted to double: " + (double)intNum);
Console.WriteLine("Integer Converted to float: " + (float)intNum);
Console.WriteLine("Integer Converted to decimal: " + (decimal)intNum);
Console.WriteLine("\n\n");

Console.WriteLine("Double before conversion: " + doubleNum + "\n");
Console.WriteLine("Double converted to integer: " + (int)doubleNum);
Console.WriteLine("Double converted to float: " + (float)doubleNum);
Console.WriteLine("Double converted to decimal: " + (decimal)doubleNum);
Console.WriteLine("\n\n");

Console.WriteLine("Float before conversion: " + floatNum + "\n");
Console.WriteLine("Float converted to integer: " + (int)floatNum);
Console.WriteLine("Float converted to double: " + (double)floatNum);
Console.WriteLine("Float converted to decimal: " + (decimal)floatNum);
Console.WriteLine("\n\n");

Console.WriteLine("Decimal before conversion: " + decimalNum + "\n");
Console.WriteLine("Decimal converted to int: " + (int)decimalNum);
Console.WriteLine("Decimal converted to double: " + (double)decimalNum);
Console.WriteLine("Decimal converted to float: " + (float)decimalNum);
Console.WriteLine("\n\n");


//Convert Data Types to Strings:
//variableName.ToString();

Console.WriteLine(intNum.ToString());
Console.WriteLine(intNum);  //implicitly call ToString() method


//Convert(Parse) Strings to Data types:
//Datatype.Parse(stringVariable) - Use when you know the string will only contain numbers

string str = "10.5";
int num1 = (int)double.Parse(str);  //Strings with decimal places need to be converted to a float, double, decimal, etc.
                                    //and then converted to an integer for conversion to work properly
double num2 = double.Parse(str);
float num3 = float.Parse(str);
decimal num4 = decimal.Parse(str);

Console.WriteLine("\n\n");

//DataType.TryParse(stringVariable, out newVariable) - Use when uncertain if the string will contain characters or not

string validString = "20";
string invalidString = "wertgfrlkn12340458";
int outputVariable;

Console.WriteLine("Testing valid string for conversion");
if (int.TryParse(validString, out outputVariable)) { Console.WriteLine("Conversion was successful"); }
else { Console.WriteLine("Conversion was unsuccessful"); }

Console.WriteLine();

Console.WriteLine("Testing invalid string for conversion");
if (int.TryParse(invalidString, out outputVariable)) { Console.WriteLine("Conversion was successful"); }
else { Console.WriteLine("Conversion was unsuccessful"); }
