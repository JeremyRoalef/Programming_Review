#Lists: A container for storing many types of data
import random

my_list_1 = [10,20,30,40,50]
#print out the list
print("Current list: " + str(my_list_1))

print()

#Accessing each element in the list
print("Accessing elements in the list...")
print(my_list_1[0]) #Uses first value in the list (10)
print(my_list_1[1]) #Uses second value in the list (20)
print(my_list_1[2]) #Uses third value in the list (30)
print(my_list_1[3]) #Uses fourth value in the list (40)
print(my_list_1[4]) #Uses fifth value in the list (50)

print()

print("Accessing elements in the list in reverse order...")
print(my_list_1[-1]) #Uses last value in the list (50)
print(my_list_1[-2]) #Uses second last value in the list (40)
print(my_list_1[-3]) #Uses third last value in the list (30)
print(my_list_1[-4]) #Uses fourth last value in the list (20)
print(my_list_1[-5]) #Uses fifth last value in the list (10)

print()

#Using For Loops on Lists
print("Accessing elements from list using a loop...")
for my_iterator in my_list_1:
    print(my_iterator) #Print first value in my_list_1, then second value and so on

print()

#Special list methods

#append(value) - Add an element to the end of the list
print("Adding 40 and 20 to the list...")
my_list_1.append(40)
my_list_1.append(20)
print("New list: " + str(my_list_1))

#insert(index, value) -  Insert a value at the given index
print("Inserting 15 as first element in the list...")
my_list_1.insert(0,15)
print("New list: " + str(my_list_1))

#remove(value) -  Remove first occurrence of a value
print("Removing first 40 in the list...")
my_list_1.remove(40)
print("New list: " + str(my_list_1))

#index(value) -  Return the first index of the value
print("Finding first index of 20 in the list...")
print("First index of 20 in list: " + str(my_list_1.index(20)))

#count(value) - Return the number of times the value occurs in the list
print("Counting the number of times 90 occurs in list...")
print("Number of times 90 occurs in list: " + str(my_list_1.count(90)))

#sort() - Sort the items in the list
print("List before sortion: " + str(my_list_1))
my_list_1.sort()
print("List after sortion: " + str(my_list_1))

#reverse() - Reverses the order of items in the list
my_list_1.reverse()
print("Reversing order of the list: " + str(my_list_1))

#extend(list) - Append all of the items in the list to another list
my_list_2 = [1,2,3]
print("My second list:" + str(my_list_2))
print("Adding first list elements to second list...")
my_list_2.extend(my_list_1)
print(my_list_2)

#pop([index]) - Remove an item at the given index and return the value. If no index is given, last element is removes
print("Removing and storing first element into a variable...")
my_var = my_list_2.pop(0)
print("New list: " + str(my_list_2))
print("The variable: " + str(my_var))

print()

#Special functions for lists
print("Current list: " + str(my_list_2))

#len(list): Returns the length of the list
print("What is the length of the list: " + str(len(my_list_2)))

#max(list): Returns the maximum value in the list
print("What is the largest value in the list: " + str(max(my_list_2)))

#min(list): Returns the minimum value in the list
print("What is the smallest value in the list: " + str(min(my_list_2)))

#sum(list): Returns the sum of the elements in the list
print("What is the sum of all the elements in the list: " + str(sum(my_list_2)))

#random.shuffle(list): Shuffles the items in the list
print("Shuffling the elements in the list...")
random.shuffle(my_list_2)
print("New order of list:" + str(my_list_2))

print()

#Using operations on lists
list1 = [1,2]
list2 = [3,4]

#list1 + list2: Appends all elements in the second list to the first list
print("list1: " + str(list1))
print("list2: " + str(list2))
print("list1 + list2: " + str(list1 + list2))
print("list2 + list1: " + str(list2 + list1))

#list1 * n: Same as list1 + list1 + ... n number of times. Appends elements in the list to the list n times.
print("list1 * 3: " + str(list1 * 3))

print()

#list1[x:y]: Creates a small list of the elements starting at index x and ending at index y (y not included)
list3 = [1,2,3,4,5,6,7]
print("Current list: " + str(list3))
print("Getting elements 3-5 from list...") #indexes 2-4
print(list3[2:5])

print()

#x in list1: Returns true if the value x is inside list1, false otherwise
print("Is 19 in the current list: " + str(19 in list3))
print("Is 3 in the current list: " + str(3 in list3))

print()

#Comparing Lists
print("Current lists:")
print("list 1: " + str(list1))
print("List 2: " + str(list2))

#list1 == or != list2: Compares element 1 in list1 to element 1 in list2, element 2 in list1 to element 2 to list2 and so on
print("Is list 1 equal to list 2: " + str(list1 == list2)) #1=3 is false, so output is false. 2=4 is also false
print("IS list 1 not equal to list 2: " + str(list1 != list2)) #1!=3 is true, and 2!=4 is true, so output is true

#list1 >= or <= list2: Compares if they are equal, then sees if element1 in list1 is greater/less than element 1 in list 2 and so on
print("Is list 1 greater than list 2: " + str(list1>list2)) #[1,2] > [3,4] -> 1>3 is false so output is false
print("Is list 1 greater than or equal to list 2: " + str(list1 >= list2)) #[1,2] >= [3,4] -> 1>3 is false and 1=3 is false
print("Is list 1 less than list 2: " + str(list1 < list2)) #[1,2] < [3,4] -> 1<3 is true and 2<4 is true, so output is true
print("Is list1 less than or equal to list2: " + str(list1 <= list2)) #1=3 is false, but 1<3 is true and 2=4 is false, but 2<4 is true

print()

#Spliiting String to Lists Using .split() Method
my_sample_string = "Hello World!"
print("Sample string: " + my_sample_string)
#Split the string into a list based on the spaces in the string
my_string_list_1 = my_sample_string.split()

print("Splitting string into a list based on the spaces...")
print(my_string_list_1)
#Split the string based on a specific character in the string
print("Splitting string into a list based on the letter 'o'...")
my_string_list_2 = my_sample_string.split("o")
print(my_string_list_2)

print()
print()
print()

#2-Dimensional Lists: Lists Stored in Lists/Nested Lists

my_2d_list = [
    [1,2,3], #Row 1, index 0
    [4,5,6], #Row 2, index 1
    [7,8,9]  #Row 3, index 2
]
#Display the 2D list to the console
print("Displaying 2-Dimensional list: " + str(my_2d_list))

#Accessing an element inside the 2D list
print("Accessing the first element in the list: " + str(my_2d_list[0][0])) #returns the list at index 0 ([1,2,3]),
                                                                           #then the element at index 0 ([1])
#Accessing a row in the list
print("Accessing first row in list: " + str(my_2d_list[0])) #returns the list at index 0 ([1,2,3])

#Accessing a column inside the 2D list
my_column = [] #empty list that will hold the elements retrieved from my_iterator
print("Accessing the first column in the list...") #First column is [1,4,7]
for my_iterator in range(len(my_2d_list)): #my_iterator will represent the index of each list inside the list -> [1,2,3], [4,5,6], [7,8,9]
    my_column.append(my_2d_list[my_iterator][0]) #appends the first element in the list -> 1,4,7
print(my_column)