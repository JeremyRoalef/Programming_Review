#Sets

#Create a set
my_set = {1,2,3,3} #Repeat values are not added to set
print("Current set: " + str(my_set))

print()

#Manipulating and Accessing Sets
print("Adding 4 to set...")
my_set.add(4)
print(my_set)

print()

print("Removing 2 from the set...")
my_set.remove(2)
print(my_set)

print()

print("What is the length of the set: " + str(len(my_set)))
print("What is the largest value in the set: " + str(max(my_set)))
print("What is the smallest value in the set: " + str(min(my_set)))
print("What is the sum of the elements in the set: " + str(sum(my_set)))
print("Is 8 in the set: " + str(8 in my_set))

print()

#Subsets & Supersets
#Subset - A set is a subject if all of its elements appear in another set
#Superset - A set is a superset if the set contains all the elements from another set
set_1 = {1,2,3}
set_2 = {1,2,3,4,5,6}

print("Current sets:")
print("Set 1: " + str(set_1))
print("Set 2: " + str(set_2))

print()

print("Is set 1 a subset of set 2: " + str(set_1.issubset(set_2))) #Does 1,2, and 3 appear in set 2 -> true
print("Is set 1 a superset of set 2: " + str(set_1.issuperset(set_2))) #Does 1,2,3,4,5, and 6 appear in set 1 -> false
print("Is set 2 a subset of set 1: " + str(set_2.issubset(set_1))) #Does 1,2,3,4,5, and 6 appear in set 1 -> false
print("Is set 2 a superset of set 1: " + str(set_2.issuperset(set_1))) #Does 1,2, and 3 appear in set 2 -> true

print()

#Equality Test
#Two sets are equal if they contain the same elements, regardless of order
set_1 = {1,2,3}
set_2 = {1,5,6}
set_3 = {1,3,2}

print("Current sets:")
print("Set 1: " + str(set_1))
print("Set 2: " + str(set_2))
print("Set 3: " + str(set_3))

print("Is set 1 equal to set 2: " + str(set_1 == set_2)) #false
print("Is set 1 equal to set 3: " + str(set_1 == set_3)) # true
print("Is set 2 equal to set 3: " + str(set_2 == set_3)) #false

print()

#Proper Subsets
#A set is a proper subset if the larger set contains all the elements in the other set, but is not equal to that subset
set_1 = {1,2,3}
set_2 = {1,2,3,4,5,6}
set_3 = {1,3,2}

print("Current sets:")
print("Set 1: " + str(set_1))
print("Set 2: " + str(set_2))
print("Set 3: " + str(set_3))

print("Is set 1 a proper subset of set 2: " + str(set_1 < set_2)) #true -> 1,2,3 appear in set 2 and set 2 has more than those elements
print("Is set 1 a proper subset of set 3: " + str(set_1 < set_3)) #false -> 1,2,3 appear in set 3, but set 3 only has those elements
print("Is set 2 a proper subset of set 1: " + str(set_2 < set_1)) #false -> 4,5,6 does not appear in set 1
print("Is set 2 a proper subset of set 3: " + str(set_2 < set_3)) #false -> 4,5,6 does not appear in set 3
print("Is set 3 a proper subset of set 1: " + str(set_3 < set_1)) #false -> 1,3,2 appear in set 1, but set 1 only has those elements
print("Is set 3 a proper subset of set 2: " + str(set_3 < set_2)) #true -> 1,3,2 appear in set 2 and set 2 has more than those elements

print()
print()

#Set Operators
set_1 = {1,3,5,7,9}
set_2 = {5,7,9,11,13}
temp_set = {}

print("Current sets:")
print("Set 1: " + str(set_1))
print("Set 2: " + str(set_2))

print()

#Union (set_1.union(set_2) or set_1 | set_2)
#Contains all elements from both sets
print("Unionizing both sets...")
temp_set = set_1 | set_2
print(temp_set)

print()

#Intersection (set_1.intersection(set_2) or set_1 & set_2)
#Contains all elements that exist in both sets
print("Finding the intersection of the sets")
temp_set = set_1 & set_2
print(temp_set)

print()

#Difference (set_1.difference(set_2) or set_1 - set_2)
#All the elements in one set, but not in the other
print("Finding all elements in set 1 not in set 2...")
temp_set = set_1 - set_2
print(temp_set)

print()

print("Finding all elements in set 2 not in set 1...")
temp_set = set_2 - set_1
print(temp_set)

print()

#Symmetric Difference (set_1.symmetric_difference(set_2) or set_1 ^ set_2)
#Unique elements in either set, but not in both sets
print("Finding the symmetric difference of the sets...")
temp_set = set_1 ^ set_2
print(temp_set)