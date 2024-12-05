def isPalindrome(str):
    normalized_char = ''.join(char.lower() for char in str if char.isalnum())
    i = 0
    k = len(normalized_char) - 1
    while(i != k):
        if(normalized_char[i] != normalized_char[k]):
            return False
        k -= 1
        i += 1
    return True

str = "aman ,  aplan, acanal, panama"
print(isPalindrome(str))