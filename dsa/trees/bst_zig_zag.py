from collections import deque


class Node:
    def __init__(self, value):
        self.value = value
        self.right: Node = None
        self.left: Node = None

def zig_zag_traversal(root: Node):
    zigzag = False
    queue = deque([root])
    list = []
    queue.append(root)
    while(queue):
        level_size = len(queue)
        list = []
        for _ in range(level_size):
            node = queue.popleft()
            list.append(node.value)
            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)
        if zigzag:
            list.reverse()
        print(list)
        zigzag = not zigzag

tree = Node(value = 8)
tree.left = Node(value = 8)
tree.right = Node(value = 10)
tree.left.left = Node(value = 1)
tree.right.right = Node(value = 3)
zig_zag_traversal(tree)