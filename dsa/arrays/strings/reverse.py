
def reverseStr(str):
    my_list = list(str)
    my_list.reverse()
    return ''.join(my_list)

a = "adcf"
print(reverseStr(a))