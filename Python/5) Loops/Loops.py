#Loops

#For Loop:
#For loop can be used to loop through lists, tuples, sets, and dictionaries

my_list = [1,2,3,4,5,6,7,8,9,10]
my_tuple = (1,2,3,4,5,6,7,8,9,10)
my_set = {1,2,3,4,5,6,7,8,9,10}
my_dictionary = {1: "value1", 2: "value2", 3: "value 3"}

print("Iterating through my list")
#iterates through my_list using each value in the list
for my_list_iterator in my_list:
    print("My iterator value is " + str(my_list_iterator))

print()

print("Iterating though my tuple")
#iterates through my_tuple using each value in the tuple
for my_tuple_iterator in my_tuple:
    print("My iterator value is " + str(my_tuple_iterator))

print()

print("Iterating through my set")
#iterates through my_set using each value in the set
for my_set_iterator in my_set:
    print("My iterator value is " + str(my_set_iterator))

print()

print("iterating through my dictionary")
for my_dictionary_iterator in my_dictionary:
    print("My iterator value is " + str(my_dictionary_iterator))

print()

#Using range function to do loops
print("iterating through range function")

for my_iterator in range(10): #Iterator starts at 0 and goes up to 10 (10 not included)
    print("My iterator value is " + str(my_iterator))

print()

for my_iterator in range(5,10): #Iterator starts at 5 and goes up to 10 (10 not included)
    print("My iterator value is " + str(my_iterator))

print()

for my_iterator in range(0,20,2): #Iterator starts at 0, increases by 2, and goes up to 20 (20 not included)
    print("My iterator value is " + str(my_iterator))

print()

#While Loops
my_iterator = 0
while my_iterator < 10:
    print("Loop #" + str(my_iterator))
    my_iterator += 1 #Same as my_iterator = my_iterator + 1

print()

#Using Break and Continue Statements:
#Break: exit completely out of the loop
#Continue: Stop the current iteration & continue to the next iteration

my_iterator = 0
while my_iterator  < 10:
    if my_iterator == 5:
        break #exit loop if my_iterator equals 5
    else:
        print("My iterator value is " + str(my_iterator))
    my_iterator += 1

print()

my_iterator = 0
while my_iterator < 10:
    if my_iterator == 4 or my_iterator == 8: #continue to next loop if my_iterator equal 4 or 8
        my_iterator += 1
        continue
    else:
        print("My iterator value is " + str(my_iterator))
    my_iterator += 1