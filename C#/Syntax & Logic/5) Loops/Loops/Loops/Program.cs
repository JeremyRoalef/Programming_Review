//Special Statements for Loops:
//continue; - stops the current loop & continues to the next iteration
//break; - Exits the loop completely

//While Loops: Pretest Loops
//while (condition) {statements;}
while (true)
{
    Console.WriteLine("While Looping...");
    break;
}

//Do-While Loops: Posttest Loops
//do{statements;} while (condition);

do {
    Console.WriteLine("Do-While Looping..."); 
} while (false);

//For Loops: Pretest Loops
//for (initializationExpression; testExpression; updateExpression) {statements;}

for  (int i = 0; i < 10; i++)
{
    if (i == 5) { continue; }
    Console.WriteLine("For Loop #" + i);
}