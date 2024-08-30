//To Create a Class in Visual Studio, Navigate to Project, Add Class, and select Class.
//Use the new file to create classes
using Classes;  //Call the Classes class (inside Classes.cs file) to this file


//Create Object of type Helllo from Classes (Class is in Classes.cs file):
Hello myClassVariable = new Hello();
//Call Method in the Object:
myClassVariable.greet();

//Create Object of type Goodbye from Classes (Class is in Classes.cs file)
Goodbye myClass2Variable = new Goodbye();

//Test Getter & Setter in myClass2Variable:
Console.WriteLine("My private string value is: " + myClass2Variable.PrivateString);

Console.WriteLine("\nChanging values...\n");
myClass2Variable.PrivateString = "hello world!";

Console.WriteLine("My new private string value is: " + myClass2Variable.PrivateString);


//Create object of type Conversation from Classes (Class is in Classes.cs file)
Conversation myConversation = new Conversation();
//show conversation
Console.WriteLine(myConversation.Sentence);
//Create another object of type Conversation & send an argument
Conversation myConversation2 = new Conversation("Beautiful weather we're having.");
//show conversation
Console.WriteLine(myConversation2.Sentence);

const int ARRAYSIZE = 4;
//Create an array of type Conversation
Conversation[] arrayOfConversations = new Conversation[ARRAYSIZE]
{
    new Conversation(),
    new Conversation(),
    new Conversation(),
    new Conversation()
};