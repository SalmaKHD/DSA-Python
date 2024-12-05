import decimal
simpleList = ["Salma", "Soheil", "Melika"]
boolean = True
booleaNot = not True
dd = boolean and booleaNot
if(dd == False):
    print("wtf00")
else:
    print("wtf")
for i in range(1,2,3):
    print("number is")
    print(i)
def printSomething(x):
    if(x == 1):
        print("Hello python again")
    else:
        print("wtf")
printSomething(1)

# getting input from the user
# name = input("what's your name?\n")
# print(f"Your name is {name}!") #fstirngs: for formatting strings

# continuation in python: \
# getting arguments from the command line: sys.argv[]

#delete a char from a string
name2 = "Soheil"
# del name2
print(f"{name2}")
# more on formatting
string1 = "{l} {g} {h}".format(g="salma", h="danian", l = "for life")
print(string1 + "\n")
String1 = "{0:b}".format(16) # 0 refers to the 0th argument in this example
print("\nBinary representation of 16 is: \n")
# another example
String2 = "{0:.2f}".format(16.343434343)
print(f"formatted decimal number is {String2}")
print("testing astring built-in function")
print(f"{"salma".capitalize()}")
# data conversion
a = 2.43
print(f"{int(a)}\n")
# use Decimal()
decimal1 = decimal.Decimal(1.2) # for financial applications and when accuracy is important
decimal2 = decimal.Decimal(1.4)
print(decimal1 + decimal2); print("\n")
decimal3 = 1.2
decimal4 = 1.4
print(f"{decimal3 + decimal4}")
# important keywords: yiled, as, pass, lambda, assert, raise, nonlocal

# covert values to bool type
print(f"the bool type for -19 is: {bool(-19)}")
print(f"the bool type for 0 is: {bool(0)}\n")
# is operator is used to check if 2 objects belong to the same class

# formatting strings: with f("") and .format()
print("salma", "soheil", "melika", sep = ",")
# file I/O is done with the print() and input() functions
print(f"{"{0:.2f}".format(23.2323)}\n")
print("this is salma", end = "")
print("this is another salma")

# lists in python: dynamic arrays
my_list = ["salma", "32", 32]
print("size of this list is: " + f"{len(my_list)}")
my_list.append("melika")
print(my_list[3])
for i in range(0,4):
    my_list.append(i)
print(my_list)
my_list.insert(1, 50)
print(my_list)
# remove from a list
my_list.remove("melika")
print(my_list)
my_list.pop()
print(my_list)
print(my_list[-4:-2])
# creating tuples
my_tuple = ("Salma", "soheil", "melika")
a,b,c = my_tuple
print(a, b, c)
# sets in python
my_set = {1,2,3}
my_set2 = set([4,5,6,6,6,6,5])
print(my_set)
for i in my_set2: # sets are unordered, so we can't access elements via index
    print(i)
print(my_set2)
my_set.discard(1)
print(my_set)
# frozenset: for converting setsto immutable sets
my_frozen_set = frozenset(my_set)
print(my_frozen_set)

import array
my_array = array.array("b", [1,2,3])
# is operator: for cheking if two objects refer to the same memory location
string22 = "sasa"
string33 = "sasa"
print(string22 is string33)
print(string22 == string33)

a = 3
# switch case in python
match a:
    case 1:
        print("a is 1")
    case 2:
        print("a is 2")
    case 3:
        print("a is 3")
    case _:
        print("a is unknown")
print(a)

# indexed for loop
l1 = ["salma", "soheil"]
for index, name in enumerate(l1):
    print(f"Person {index+1} is: {name}")
my_tuple_list = [(1,2), (3,4)]
for i, k in my_tuple_list:
    print(f"{i}, {k}")
# else branch in while and for loops: executed when break or exception is not encountered
i = 3
while(i<5):
    print(i)
    i += i
else:
    print("Out of the while loop...")
# list comprehension
my_listt = [i**3 for i in range(0,10)]
for k in my_listt:
    print(k)
# dictionary comprehension
# myDisctionay = {k:v for (k,v) in {1:2, 3:4}.fromkeys(range(2), True)}
# for (k,v) in myDisctionay:
    # print(f"{k},{v}")
# it's possible for pyhton functions to return fucntions
def my_function():
    def another():
         print("This is a local function")
    return another
my_function()()
# range() function syntax: range(start, stop, step)
for i in range(5, 20, 2):
    print(i)
# *args and **kwargs: args gets arguments as tuple and kwargs gets them as dictionary
# *args allows passing variable number of arguments while kwargs allows passing variable number of ke-value pairs
def func_with_args(*args):
    for i in args:
        print(i)
func_with_args(1,2,3,4)
def fun_with_kwargs(**kwargs):
    for (i,k) in kwargs.items():
        print(f"{i}, {k}")
fun_with_kwargs(arg1 = 1, arg2 = 2) # key-value pairs

# map function syntax: map(function, list)
my_map = map(lambda x:
             x+x, [1,2,3,4]) # 2,3,6,8
for i in my_map:
    print(i)

import operator
import functools
# filter function: to filter elements in a list
filtered_list = functools.reduce(operator.add, [1,2,3,4])
reduced_list = functools.reduce(lambda a, b: a+b if a>b else b, [2,3,4,5,6])
print(reduced_list)
a = b = 4
print("hello world") if a==b else print("Hello")

# oop
class Animal:
    sound = "Bark"
    def __init__(self) -> None:
        print("Creating a new instance")
        self.sound = "Mew"
        print(self.sound)
    def __str__(self) -> str:
        return "the sound of this animal is: " + self.sound
cat = Animal()
print(cat)

# inheritance in python
# class Cat(Animal):
#     def _init(self, sound): # the host object is given through function parameter
        # self.sound = sound.
# cat2 = Cat()
# print("cat sound is:" + cat2.sound)

# assing multiple values
a, b , c = "Salma", "Soheil", "Melika"
print(a)
print(b)
print(c)
a = b = c = "Salma"
print(a)
print(b)
print(c)
x = ["Salma", "Soheil", "Melika"]
a, b, c = x
print(a)
print(b)
print(c)
''' 
Output:
Salma
Soheil
Melika
Salma
Salma
Salma
Salma
Soheil
Melika
'''

x = "Salma"
# global variables
def printName():
    global x
    x = "Soheil"
    print(x)
printName()
'''
output:
Soheil
'''