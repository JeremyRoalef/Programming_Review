#Classes

#Create a class
class MyFirstClass:
    #initialize the class with attributes (variables)
    def __init__(self): #self is used to refer to an object's own attributes
        self.my_attrubute = 10 #variable is public because there is no leading '_'
        self._my_private_attribute = "Hello World!" #private variables declared with leading '_'

    #Create getter, setter, & deleter methods for the private attribute
    @property #Defines a getter method for an attribute. Allows for special use for objects (See Examples.py for example)
    def my_private_attribute(self):
        return self._my_private_attribute
    @my_private_attribute.setter #Defines a setter method for an attribute. Allows for special use for objects (See Examples.py for example)
    def my_private_attribute(self, new_value):
        self._my_private_attribute = new_value
    @my_private_attribute.deleter #Defines a deleter methods for an attribute. Allows for special use for obejects (See Examples.py for example)
    def my_private_attribute(self):
        del self._my_private_attribute

#More about Initializers & __str__() methods
class MySecondClass():
    #Initialize objects with attributes x, y, and z, all private.
    #Create parameters to assign values to x,y, and z as defined from object creation. default values for y and z will be 2 and 4

    def __init__(self,x, y = 2, z = 4):
        self._x = x
        self._y = y
        self._z = z

    #Create getters for each value
    @property
    def x(self):
        return self._x
    @property
    def y(self):
        return self._y
    @property
    def z(self):
        return self._z

    #Create __str__ method. (See Examples.py for use case)
    def __str__(self):
        #__str__ method must return a string data type
        string = ""
        string += ("x = " + str(self._x) + "\n")
        string += ("y = " + str(self._y) + "\n")
        string += ("z = " + str(self._z))
        return string