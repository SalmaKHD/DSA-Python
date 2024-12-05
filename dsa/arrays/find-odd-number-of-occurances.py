def findOddNumberOfOccurances(arr):
    occurance_times = {}
    for element in arr:
        occurance_times[element] =  occurance_times.get(element, 0) + 1

    for i in occurance_times:
        if(occurance_times[i] %2 != 0): return i
    return -1

arr=[2, 3, 5, 4, 5, 2, 4,3, 5, 2, 4, 4, 2]
print(findOddNumberOfOccurances(arr))
'''
output: 
5
'''