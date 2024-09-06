using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Inheritance___Polymorphism
{
    //Basic class creation
    internal class Animal
    {
        //Basic animal attribute
        private int _numberOfLegs;

        //constructor for animal
        public Animal(int numberOfLegs)
        {
            _numberOfLegs = numberOfLegs;
        }
        //create no-argument constructor
        public Animal() : this (0) { }

        //basic animal method
        public virtual void makeSound()
        {
            Console.WriteLine("the animal makes a sound");
        }

        public int NumberOfLegs
        {
            get { return _numberOfLegs; }
            set { _numberOfLegs = value; }
        }
    }

    //Inherit Animal properties in Cat class
    internal class Cat : Animal
    {
        //Attributes specific to cat
        bool _hasFur;
        string _breed;

        //create constructor for Cat (Cat Attributes: _hasFur, _breed, _numberOfLegs (from Animal class))
        public Cat(bool hasFur, string breed, int numberOfLegs) : base(numberOfLegs) //takes numberOfLegs param & sends that
                                                                                     //to the Animal constructor
        {
            this._hasFur = hasFur;
            this._breed = breed;
        }

        //create getter & setter for new attributes
        public bool HasFur
        {
            get { return _hasFur; }
            set { _hasFur = value; }
        }
        public string Breed
        {
            get { return _breed; }
            set { _breed = value; }
        }

        //override default makeSound() method
        public override void makeSound()
        {
            Console.WriteLine("The cat meows");
        }
    }
}
