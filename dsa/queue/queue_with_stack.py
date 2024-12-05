from collections import deque


class CustomQueue:
    def __init__(self):
        self.stack1 = deque()
        self.stack2 = deque()
        self.filled_stack = 1

    def enqueue(self, value):
        if(self.filled_stack == 1):
            self.stack1.append(value)
        else:
            self.stack2.append(value)

    def dequeue(self):
        if(self.filled_stack == 1 and self.stack1):
            while self.stack1:
                last_value = self.stack1.pop()
                self.stack2.append(last_value)
            self.filled_stack = 2
            return self.stack2.pop()
        elif(self.filled_stack == 2 and self.stack2):
              while self.stack2:
                last_value = self.stack2.pop()
                self.stack1.append(last_value)
                self.filled_stack = 1
                return self.stack1.pop()
        else:
            print("Queue is empty")
            return None

queue = CustomQueue()
queue.enqueue(1)
queue.enqueue(2)
queue.enqueue(3)
print(queue.dequeue())  # Outputs: 1
print(queue.dequeue())  # Outputs: 2
'''
output: 
'''