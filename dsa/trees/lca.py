class Node():
    value = 0
    left = None
    right = None

# return either the node or the common ancestor
def find_lca(root: Node, p: Node, q: Node):
    # base case
    if not root or root == p or root == q:
        return root
    left = find_lca(root.left, p, q)
    right = find_lca(root.right, p, q)

    # parent found, return
    if left and right:
        return root
    return left if left else right