'''
Given an array arr. Find the majority element in the array. If no majority exists, return -1. A majority element in an array is an element that appears strictly more than arr.size() / 2 times in the array.
'''
from collections import defaultdict
def doesHaveMajorElement(arr):
    min_occurance_times = int(len(arr)/2)
    occurance_times = defaultdict(int)
    for el in arr:
        occurance_times[el] += 1
        if( occurance_times[el]  >= min_occurance_times): return True
    return False

arr = [1, 1, 2, 1, 3, 5, 1]
print(doesHaveMajorElement(arr))