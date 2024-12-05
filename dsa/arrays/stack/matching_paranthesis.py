from collections import deque

def areMatchingParanghesis(text):
    stack = deque()
    opening_chars = ["(", "[", "{"]
    closing_chars = [")", "]", "}"]
    for character in text:
        if(character in opening_chars):
            # push to stack, not time for checking
            stack.append(character)
        else:
            # time for comparing
            if not stack:
                return False
            last_char = stack.pop()
            matching_char_index = opening_chars.index(last_char)
            if(character == closing_chars[matching_char_index]):
                continue
            else:
                return False
    if not stack:
        return True
    else:
        return False

input = "{[]}"
print(areMatchingParanghesis(input))
input2 = "(]"
print(areMatchingParanghesis(input2))
input3 = ")[]"
print(areMatchingParanghesis(input3))
input4 = "()[]())"
print(areMatchingParanghesis(input4))
'''
output:
True
False
False
False
'''