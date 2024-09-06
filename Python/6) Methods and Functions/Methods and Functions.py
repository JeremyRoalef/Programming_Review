#Methods and Functions

#Create a function
def my_first_function():
    print("This is my first function!")
#Call the function
my_first_function()

print()

#Return a value from a function
def my_value_returning_function():
    return 100
#Use the function to return a value to a variable
my_variable = my_value_returning_function()
#Display the value to the console
print(my_variable)

print()

#Return multiple values from a function
def my_many_value_returning_function():
    var1 = 10
    var2 = "Hello"
    var3 = True
    return var1, var2, var3 #returns var1 to first, var2 second, and var3 third

#use function to store values in many variables (var1 stored in my_var_1, var2 stored in my_var_2, etc.)
my_var_1, my_var_2, my_var_3 = my_many_value_returning_function()
#Display variables to the console
print(my_var_1)
print(my_var_2)
print(my_var_3)

print()

#Send values (parameters) to a function to use inside the function
def my_function_with_parameters(my_first_parameter, my_second_parameter):
    return my_first_parameter + my_second_parameter

my_variable = my_function_with_parameters(10,5)
print(my_variable)