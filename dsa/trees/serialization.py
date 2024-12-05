from collections import deque


class Node():
    value = 0
    left = None
    right = None

    def __init__(self, value: int):
        self.value = value

def serializeTree(root: Node, serialized_form):
    if(not root):
        return serialized_form + "#,"
    serialized_form += str(root.value) + ","
    serialized_form = serializeTree(root.left, serialized_form)
    serialized_form = serializeTree(root.right, serialized_form)
    return serialized_form
def deserialize(serialized_form: str):
    arr = deque(serialized_form.split(","))
    tree = arr.popleft()
    if(tree is None):
        return None
    root = Node(int(tree))

    queue = deque([root])
    while(arr):
        current_node=queue.popleft()
        node = arr.popleft()
        if node.value != "#":
            current_node.left = Node(int(node))
            queue.append(current_node.left)
        if arr:
            right_value = arr.popleft()
            if right_value != "#":
                current_node.right = Node(int(right_value))
                queue.append(current_node.right)
        return root

tree = Node(value = 2)
tree.left = Node(4)
tree.right = Node(10)
tree.left.left = Node(20)
tree.right.right = Node(32)
print(serializeTree(tree, ""))
# 2,4,20,#,#,#,10,#,32,#,#,