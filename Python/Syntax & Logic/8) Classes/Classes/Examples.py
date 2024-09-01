from Classes import * #Import all the classes from the Classes.py file

#Create an object of type MyFirstClass (See Classes.py file)
print("Creating object...")
my_first_object = MyFirstClass()
print("Object created.")

print()

print("Accessing my_attribute from the object...")
print(my_first_object.my_attrubute)

print()

print("Accessing my_private_attribute from the object...")
print(my_first_object.my_private_attribute)

print()

print("Changing the value of the object's attributes...")
my_first_object.my_attrubute = 5
my_first_object.my_private_attribute = "Goodbye World!"
print("New values:")
print(my_first_object.my_attrubute)
print(my_first_object.my_private_attribute)

print()

print("Deleting my_private_attribute from the object...")
del my_first_object.my_private_attribute

print()
print()
print()

#Create new object from MySecondClass (See Classes.py file)
print("Creating new object...")
my_second_object = MySecondClass(4) #Only 1 argument needed because others have default values
print("Object created.")

print()

print("Displaying object properties...")
print("x = " + str(my_second_object.x))
print("y = " + str(my_second_object.y))
print("z = " + str(my_second_object.z))

print()

#Call the object's __str__() method
print("Calling object's __str__() method...")
print(my_second_object) #implicitly calls my_second_object.__str__() method