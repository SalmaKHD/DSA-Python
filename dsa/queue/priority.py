import _heapq

class PriorityQueue:
    def __init__(self):
        self.heap = []

    def insert(self, value, priority):
        _heapq.heappush(self.heap, (priority, value))

    def pop(self):
        if not self.heap:
            raise IndexError()
        return _heapq.heappop(self.heap)[1]

pq = PriorityQueue()
pq.insert("task1", 1)
pq.insert("task2", 3)
pq.insert("task3", 2)

print(pq.pop())  # Outputs: "task2" (highest priority)
print(pq.pop())  # Outputs: "task3" (next highest priority)
print(pq.pop())  # Outputs: "task1" (lowest priority)