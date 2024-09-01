#Decision Structures

#If Statements:

my_condition = 1 > 5 #false

if my_condition == False:
    print("My condition is false")

print()
print()
print()

#If - Else Statements:

if my_condition == True:
    print("My condition is true")
else:
    print("My condition is false")

print()
print()
print()

#If - Elif - Else Statements:

if my_condition == True:
    print("My condition is true.")
elif my_condition == False:
    print("My condition is false.")
else:
    print("My condition is neither true nor false.")

print()
print()
print()

#Logical Conjunctions:
# and
# or
# not

if 1 < 4 and 1 < 2:
    print("1 is less than 4 and less than 2")
if not 5 < 4: #runs if the condition is false instead of true
    print("5 is not less than 4")
if 5 < 4 or 5 > 1: #runs if either condition is true
    print("Either 5 is less than 4 or 5 is greater than 1")

#Match-Case Statements

my_number = 3
match(my_number):
    case 1: #runs if my_number is equal to 1
        print("My number is 1")
    case 2: #runs if my_number is equal to 2
        print("My number is 2")
    case 3: #runs if my_number is equal to 3
        print("My number is 3")
    case _: #runs if my_number does not match any other given case
        print("My number is not 1, 2, or 3")