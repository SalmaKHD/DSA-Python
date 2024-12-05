from collections import deque


def evaluate_post_fix(token_list):
    operator_list = ["+", "-", "*", "/"]
    stack = deque()
    for token in token_list:
        if(token in operator_list):
            try:
                first_operand = stack.pop()
                second_operand = stack.pop()
                match token:
                    case "+":
                        stack.append(second_operand + first_operand)
                    case "-":
                        stack.append(second_operand - first_operand)
                    case "*":
                        stack.append(second_operand * first_operand)
                    case "/":
                        stack.append(second_operand / first_operand)
            except:
                print("Invalid format. Quitting...")
                return None
        else:
            stack.append(int(token))

    if not stack:
        return None
    else:
        return stack.pop()

input = ["2", "1", "+", "3", "*"]
print(evaluate_post_fix(input))
input2 = ["4", "13", "5", "/", "+"]
print(evaluate_post_fix(input2))
input3 = ["10", "6", "9", "3", "/", "-11", "*", "/", "*"]
print(evaluate_post_fix(input3))
'''
OUTPUT:
9
6.6
-1.8181818181818183
'''