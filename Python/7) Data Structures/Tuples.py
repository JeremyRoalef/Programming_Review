#Tuples

#Creating a tuple using parenthesis
my_tuple = (1,2,3,4,5,6,7,8,9,10)
print("Current tuple:" + str(my_tuple))

print("Counting number of times 1 appears in the tuple: " + str(my_tuple.count(1)))
print("Finding the index of 9 in the tuple: " + str(my_tuple.index(9)))

print()

#Creating a tuple from a list
my_list = [1,2,3,4]
print("Sample list:" + str(my_list))
print("Converting list into a tuple...")
my_tuple_2 = tuple(my_list)
print("Tuple created: " + str(my_tuple_2))