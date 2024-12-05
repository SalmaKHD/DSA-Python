def findLongestNonRepeatingSubstr(stri):
    start = 0
    end = 0
    max_length = 0
    char_set = set()
    for end in range(len(stri)):
        while stri[end] in char_set:
            char_set.remove(stri[end])
            start += 1
        char_set.add[stri[end]]
        max_length = max(max_length, end-start + 1)
    return max_length
a = "salmasaa"
print(findLongestNonRepeatingSubstr(a))