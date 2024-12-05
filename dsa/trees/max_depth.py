from collections import deque


class Node():
    value = 0
    left = None
    right = None
def find_max_length(root: Node):
    if(root is None):
        return 0
    rLength = find_max_length(root.right)
    lLength = find_max_length(root.left)
    length = max(rLength, lLength) + 1
    return length

def find_max_length_bfs(root: Node):
    if not root:
        return 0
    depth = 0
    q = deque()
    q.append(root)
    q.append(None)
    while(q):
        curr = q.popleft()

        if(curr is None):
            depth += 1

            if(q):
                q.append(None)
        else:
            # keep pushing
            if(curr.left):
                q.append(curr.left)
            if(curr.right):
                q.append(curr.right)

    return depth