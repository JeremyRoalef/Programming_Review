#Data Conversions

#Common Data Conversion Methods:
#str() - Converts a data type to a string
#int() - Converts a data type to an integer
#float() - Converts a data type to a float
#bool() - Converts a data type to a boolean

my_variable = "123"

print(str(type(my_variable)))
#convert the variable from a string to an integer & display the data type to the console
my_variable = int(my_variable)
print(str(type(my_variable)))

#convert the variable from an integer to a float & display the data type to the console
my_variable = float(my_variable)
print(str(type(my_variable)))

my_boolean = "5<3"
#convert the variable into a boolean & display the data type to the console
my_boolean = bool(my_boolean)
print(str(type(my_boolean)))