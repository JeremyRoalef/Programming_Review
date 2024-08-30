//Classes:
namespace Classes
{
    //Attributes & Methods
    internal class Hello
    {
        //Attributes (Variables)
        string _myClassString = "Hello World";

        //Methods (Funcitons)
        public void greet()
        {
            Console.WriteLine(_myClassString);
        }
    }

    //Data Hiding & Creating Getter/Setter Methods
    internal class Goodbye
    {
        //Create private methods (Cannot be accessed outside of the class)
        private string _myPrivateString = "Goodbye World!";

        //Create Getter & Setter for attribute (Gives Access to Attributes Without Calling them Out of Class)
        public string PrivateString
        {
            get { return _myPrivateString; }
            set { _myPrivateString = value; }
        }
    }
    //Constructors & Overloading Methods
    internal class Conversation
    {
        private string sentence;

        public Conversation(string conversation)
        {
            this.sentence = conversation; //'this' is a placeholder to say 'this'
                                             //object's attribute/method
        }
        //overloading constructor
        public Conversation() : this("What did you do yesterday?") //this is called when no arguments
                                                                   //are given in object creation
        {

        }
        public string Sentence
        {
            get { return sentence; }
        }
    }
}
