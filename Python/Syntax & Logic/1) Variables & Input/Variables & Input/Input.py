#Input Function:

#The Input Function Asks the User to Type Something on Their Keyboard & Saves
#What They Entered as a String

#Using Input Function to Store User Input in Variables
user_message = input("Enter anything: ")
#Diplay the data type or user_message to the console
print("Data type of your message: " + str(type(user_message))) #Notice how it says the variable data type is a string ('str')

#Using Input Function to Get an Integer Number
user_integer = int(input("Enter an integer: ")) #int() function converts the user's string input to an integer
#Display the data type of user_integer to the console
print("Data type of your integer: " + str(type(user_integer))) #Notice how it say the variable data type is an integer ('int')

#Using Input Function to Get a Float Number
user_float = float(input("Enter a float: "))
#Display the data type of user_float to the console
print("Data type of your float: " + str(type(user_float))) #Notice how it says the variable data type is a float ('float')