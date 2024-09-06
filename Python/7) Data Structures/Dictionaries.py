#Dictionaries

#Create a dictionary
my_dictionary = {"a": "Hello", #Use the key "a" to get the value "Hello"
                 "b": "World", #Use the key "b" to get the value "World"
                 "c": "!"}     #Use the key "c" to get the value "!"
#Display the dictionary to the console
print("Current dictionary: " + str(my_dictionary))

#Access entries in the dictionary
print("Accessing entry c from dictionary: " + my_dictionary["c"])

print()
print()

#Add & Modify Content in the Dictionary
print("Adding new entry to the dictionary...")
my_dictionary["d"] = "Greetings"
print(my_dictionary)

print()

print("Changing first entry of the dictionary...")
my_dictionary["a"] = "Goodbye"
print(my_dictionary)

print()

print("Deleting entry c from dictionary...")
del my_dictionary["c"]
print(my_dictionary)

print()

#Using Loops on a dictionary
print("Looping through dictionary...")
for my_iterator in my_dictionary:
    print("Entry: " + my_iterator)
    print("Entry value: " + my_dictionary[my_iterator])

print()

#Operators on dictionary
print("What is the length of the dictionary: " + str(len(my_dictionary)))
print("Is entry h in the dictionary: " + str("h" in my_dictionary))

print()
print()

#Dictionary Methods

#keys() - Returns a tuple of all the keys in the dictionary
print("Accessing all keys in the dictionary...")
print(my_dictionary.keys())

print()

#values() - Returns a tuple of all the values in the dictionary
print("Accessing all values in the dictionary...")
print(my_dictionary.values())

print()

#items() - Returns a tuple of key-value pairs in the dictionary
print("Accessing all items in the dictionary...")
print(my_dictionary.items())

print()

#get(key) - Returns the value for the key
print("Getting the value for key a...")
print(my_dictionary.get("a"))

print()

#pop(key) - Returns the value for the key, then deletes its entry
print("Popping key b from the dictionary")
print(my_dictionary.pop("b"))

print()

#clear() - Deletes all entries in the dictionary
print("Clearing the dictionary...")
print(my_dictionary.clear())