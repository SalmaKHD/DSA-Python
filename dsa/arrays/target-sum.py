
# returns true if it finds a pair whose sum equals target
def targetSum(arr, target):
    complements = set()
    for element in arr:
        complement = target - element
        if(element in complements): return True
        complements.add(complement)
    return False

arr = [0, -1, 2, -3, 1]
target = -2

if targetSum(arr, target):
    print("true")
else:
    print("false")