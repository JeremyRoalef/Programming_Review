#Mathematical Operations

#Numeric Operations:
# + (Add)
# - (Subtract)
# * (Multiply)
# / (Divide)
# // (Integer Divide)
# ** (Exponent)
# % (Remainder)

myAddition = 1+1 #Add 1 to 1
print("1+1=" + str(myAddition))

mySubtraction = 5-4 #Subtract 4 from 5
print("5-4=" + str(mySubtraction))

myMultiplication = 6*3 #Multiply 6 by 3
print("6*3=" + str(myMultiplication))

myDivision = 30/6 #Divide 30 by 6
print("30/6=" + str(myDivision))

myIntegerDivision = 5//2 #Divide 5 by 2 and drop the decimal places (5/2=2.5, drop the decimal = 2)
print("5//2=" +str(myIntegerDivision))

myExponent = 3**4 #Raise 3 to the power of 4 (3*3*3*3)
print("3 to the power of 4=" + str(myExponent))

myRemainder = 5%2 #Divide 5 by 2 and remainder is the output (5/2=2 remainder 1, ouput = 1)
print("5%2=" + str(myRemainder))

print()
print()
print()

#Concatenating Strings:
#Strings can be added together to create one string
myString1 = "Hello"
myString2 = " World!"
myString3 = myString1 + myString2

print(myString1)
print(myString2)
print(myString3)