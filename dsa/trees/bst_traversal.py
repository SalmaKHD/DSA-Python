from collections import deque

class Node:
    def __init__(self, value):
        self.value = value
        self.right = None
        self.left = None

class BinaryTree:
    def __init__(self):
        self.root = None

    def insert(self, value):
        if(self.root == None):
            self.root = Node(value)
            return
        else:
            queue = deque([self.root])
            empty_node = None
            while(queue):
                node = queue.popleft()
                if(node.left == None):
                    node.left = Node(value)
                    return
                else:
                    queue.append(node.left)
                if(node.right == None):
                    node.right = Node(value)
                    return

                else:
                    queue.append(node.right)


    def preorder_traversal(self, node: Node):
        if node is None:
            return []
        result = []
        result.append(node.value)
        if(node.left != None):
            result += self.preorder_traversal(node.left)
        if(node.right != None):
            result += self.preorder_traversal(node.right)
        return result

    def post_order_traversal(self, node: Node):
        if node is None:
            return []
        result = []
        if(node.left != None):
            result += self.post_order_traversal(node.left)
        if(node.right != None):
            result += self.post_order_traversal(node.right)
        result.append(node.value)
        return result

    def inorder_traversal(self, node: Node):
        if node is None:
            return []
        result = []
        if(node.left != None):
            result += self.inorder_traversal(node.left)
        result.append(node.value)
        if(node.right != None):
            result += self.inorder_traversal(node.right)
        return result