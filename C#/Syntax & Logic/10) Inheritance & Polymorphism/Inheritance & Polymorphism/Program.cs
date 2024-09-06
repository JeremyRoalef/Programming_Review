//Demonstrating Inheritance
using Inheritance___Polymorphism;

//create animal object
Animal animal = new Animal();
animal.makeSound();

//create cat object
Cat cat = new Cat(true,"Munchkin",4);

//test each attribute of cat object
Console.WriteLine("Number of legs for cat is " + cat.NumberOfLegs);
Console.WriteLine("Does cat have fur? " + cat.HasFur);
Console.WriteLine("Breed of cat: " + cat.Breed);

//test if makeSound() method is overridden
cat.makeSound();


//Demonstrating Polymorphism

Animal unknownAnimal;       //create object of type Animal

unknownAnimal = animal;     //creates a point to object animal created above
unknownAnimal.makeSound();  //show object is pointing towards animal object
unknownAnimal = cat;        //changes the pointer to the cat object created above
unknownAnimal.makeSound();  //prove object is pointing towards the cat object