def findRightLeaders(arr):
    rightLeaders = []
    i = len(arr) - 1
    biggestNumberFromRight = arr[i]
    rightLeaders.append(biggestNumberFromRight)
    print(biggestNumberFromRight, end = " ")
    while(i > 0):
        if(arr[i] > arr[i-1]):
            biggestNumberFromRight = arr[i]
            rightLeaders.append(biggestNumberFromRight)
            print(biggestNumberFromRight, end = " ")
        i -= 1
    return rightLeaders

arr = [16, 17, 4, 3, 5, 2]
print("\n" + str(findRightLeaders(arr)))