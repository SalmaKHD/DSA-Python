def findLongestSubstr(str):
    seen_chars = set()
    start = 0
    end = 0
    max_length = 0
    for end in range(len(str)):
        while (str[end] in seen_chars):
            start += 1
            seen_chars.remove(str[start])
        seen_chars.add(str[end])
        max_length = max(max_length, end -start +1)
    return max_length

str = "abcabcbb"
print(findLongestSubstr(str))