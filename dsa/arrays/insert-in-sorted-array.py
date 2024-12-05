def binarySearch(arr, low, high, key):
    mid = int((low + high)/2)
    if(low > high or high < low): return -1
    if (key == arr[mid]):
        return mid
    if (key > arr[mid]):
        return binarySearch(arr, (mid + 1), high, key)
    if (key < arr[mid]):
        return binarySearch(arr, low, (mid-1), key)

# do finding and shifting at the same time
def insertElement(arr, n , capacity, key):
    i = n-2 # will lose the last element while inserting
    while i >= 0 and arr[i] > key:
        arr[i+1] = arr[i]
        i -= 1
    arr[i+1] = key
    return n+1

# find position of element using binary search first then shift to delete
def deleteElement(arr, n, key):
    pos = int(binarySearch(arr, 0, n-1, key))
    if(pos == -1): return
    for i in range(pos, n-1):
        arr[i] = arr[i+1]
    arr[n-1] = -1

arr = [5, 6, 6, 8, 9, 10, 0]
insertElement(arr, len(arr), len(arr), 7)
deleteElement(arr, len(arr), 10)
# print(binarySearch(arr, 0, len(arr)-1, 6))

print(arr)

# my_array = [12,13,14,15,0]
# print(binarySearch(my_array, 0, len(my_array)-1, 10))