//Logical Operators:
// > (Greater than)
// < (Less than)
// >= (Greater than or equal to)
// <= (Less than or equal to)
// == (Equal to)
// != (Not equal to)
// ! (not)

// Logical Conjunctions:
// && (and)
// || (or)
//If Statements:
//if (condition) {statements;}


if (1 < 2)
{
    Console.WriteLine("1 is less than 2");
}

//If-Else Statements:
//if (condition) {statements;} else {statements;}

if (1 > 2)
{
    Console.WriteLine("1 is greater than 2");
}
else
{
    Console.WriteLine("1 is not greater than 2");
}

//If-Else If-Else Statements:

if (1 > 2)
{
    Console.WriteLine("1 is greater than 2");
}
else if (1 > 3)
{
    Console.WriteLine("1 is greater than 3");
}
else
{
    Console.WriteLine("1 is not greater than 2 or 3");
}


//Switch Statements:
//switch(variable){case n: statements; break; default: statements; break;}

int intVariable = 1;

switch (intVariable)
{
    case 1:
        Console.WriteLine("intVariable is 1");
        break;
    case 2:
        Console.WriteLine("intVariable is 2");
        break;
    default:
        Console.WriteLine("intVariable does not match any other case");
        break;
}