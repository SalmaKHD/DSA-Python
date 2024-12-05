def findElement(arr, n, key):
    for i in range(0, n):
        if(arr[i] == key):
            return i
    return -1
my_array = [12,13,14,15]
print(findElement(my_array, len(my_array), 13))
print(findElement(my_array, len(my_array), 11))
'''
output: 
1
-1
'''