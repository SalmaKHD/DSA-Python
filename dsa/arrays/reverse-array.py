
def reverseArray(arr):
    newArray = [None] * len(arr)
    j = len(newArray)-1
    for i in range(0, len(arr)):
        newArray[j] = arr[i]
        j -=1
    return newArray

arr = [12,11,4,5,4,34]
print("original array: " + str(arr))
print("reversed array: " + str(reverseArray(arr)))
'''
output: 
original array: [12, 11, 4, 5, 4, 34]
reversed array: [34, 4, 5, 4, 11, 12]
'''