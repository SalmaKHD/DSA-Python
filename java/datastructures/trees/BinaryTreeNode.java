import java.util.ArrayList;
import java.util.Currency;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import jdk.incubator.vector.VectorOperators.Binary;

public class BinaryTreeNode {
    public boolean isTreeEmpty = true;
    public int data;
    public BinaryTreeNode left, right;
    public BinaryTreeNode(int data ) {
        this.data = data;
        this.left = null;
        this.right = null;

    }

    public void insert(int value) {
        if(isTreeEmpty) {
            data = value;
        } else {
            // find where to insert and insert
            BinaryTreeNode _current = this;
            boolean flag = true;
            while(_current != null && flag) {
                if(_current.data > value) {
                    _current = _current.right;

                } else if(_current.data < value) {
                    _current = _current.left;
                }
            }
            _current = new BinaryTreeNode(value);
        }
    }

    public boolean removeItem(int value) {

        return true;
    }

    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }

    public BinaryTreeNode getLeft() {
        return this.left;
    }

    public BinaryTreeNode getRight() {
        return this.right;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    public void PreOrder(BinaryTreeNode root) {
        if(root!=null) {
            System.out.println(root.data);
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }
    
    public ArrayList<Integer> preorderTraversal(BinaryTreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null) {
            return res;
        }
        Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
        s.push(root);
        while(!s.isEmpty()) {
            BinaryTreeNode tmp = s.pop();
            res.add(tmp.data);
            if(tmp.right!=null) {
                s.push(tmp.right);
            }
            if(tmp.left != null) {
                s.push(tmp.left);
            }
        }
        return res;
    }

    public void inOrder(BinaryTreeNode root) {
        if(root!=null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    public ArrayList<Integer> InOrderTranversal(BinaryTreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode> ();
        BinaryTreeNode currentNode = root;
        boolean done = false;
        while(!done) {
            if(currentNode != null) {
                s.push(currentNode);
                currentNode = currentNode.left;
            } else{
                currentNode = s.pop();
                res.add(currentNode.data);
                currentNode = currentNode.right;
            }
        }
        return res;
    }

    public void PostOrder(BinaryTreeNode root) {
        if(root!=null) {
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data);
        }
    }

    public ArrayList<Integer> PreorderTraversal(BinaryTreeNode root) {
        ArrayList<Integer> res= new ArrayList<Integer>();
        if(root==null) {
            return res;
        }
        Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
        s.push(root);
        BinaryTreeNode prev = null;
        while(!s.isEmpty()) {
            BinaryTreeNode curr = s.peek();
            if(prev==null || prev.left == curr || prev.right == curr) {
                if(curr.left != null) 
                s.push(curr.left);
                else if(curr.right != null)
                s.push(curr.right);
                
            } else if(curr.left == prev) {
                if(curr.right != null)
                s.push(curr.right);
            } else {
                res.add(curr.data);
                s.pop();
            }
            prev = curr; 
        }
        return res;
    }

    public ArrayList<ArrayList<Integer>> levelOrder(BinaryTreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(root ==null) return res;
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode> () ;
        q.offer(root);
        q.offer(null);
        ArrayList<Integer> curr = new ArrayList<Integer>();
        while(!q.isEmpty()) {
            BinaryTreeNode tmp = q.poll();
            if(tmp != null) {
                curr.add(tmp.data);
                if(tmp.left != null)
                q.offer(tmp.left);
                if(tmp.right != null) 
                q.offer(tmp.right);
            } else {
                ArrayList<Integer> c_curr = new ArrayList<Integer>(curr);
                res.add(c_curr);
                curr.clear();
                if(!q.isEmpty()) {
                    q.offer(null);
                }
            }
        }
        return res;
    }

    public BinaryTreeNode lookup(int value) {
        if(value == data) {
            return this;
        }
        BinaryTreeNode _current = this;
        while(_current!=null) {
            if(_current.data == value) {
                return _current;
            } else if(_current.data > value) {
                _current = _current.right;
            } else {
                _current = _current.left;
            }
        }
        return null;
    }

    /*
    push left child to queue, then right child to queue, 
    come back and start peeking from the left node
    */
    public Array<Integer> breadthFirstSearch() {
        BinaryTreeNode currentNode = this;
        ArrayList<Integer> result = new ArrayList<Integer>();
        Queue<BinaryTreeNode> queue = new Queue<BinaryTreeNode>();
        queue.add(currentNode);
        while(queue.size() > 0) {
            currentNode = queue.poll();
            result.add(currentNode.data);
            if(currentNode.left!=null) {
                queue.add(currentNode.left);
            } 
            if(currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return result;
    }

    public Array<Integer> breadthFirstSearchRecursive(Queue<Integer> queue, Arraylist<Integer> result) {
        if(queue.size() > 0) {
            currentNode = queue.poll();
            result.add(currentNode.data);
            if(currentNode.left!=null) {
                queue.add(currentNode.left);
            } 
            if(currentNode.right != null) {
                queue.add(currentNode.right);
            }
            breadthFirstSearchRecursive(queue, result);
        }
        return result;
    }

     public ArrayList<Integer> traverseInOrderDFS(BinaryTreeNode node, ArrayList<Integer> result) {
         if(node.left != null) {
             traverseInOrderDFS(node.left, result);
         }
         result.add(current.value);
         if(node.right != null) {
             traverseInOrderDFS(node.right, result);
         }

         return result; 
     }

     public ArrayList<Integer> traversePreorderDFS(BinaryTreeNode node, ArrayList<Ineger> result) {
         result.add(node.data);
         if(currentNode.left != null) {
             traversePreorderDFS(node, result);
         }
         if(currentNode.right != null) {
             traversePreorderDFS(node, result);
         }
         return result;
     }

     public ArrayList<Integer> traversePostOrder(BinaryTreeNode node, ArrayList<Integer> result) {
         if(currentNode.left != null) {
             traversePostOrder(node, result);
         }
         if(currentNode.right != null) {
             traversePostOrder(node, result);
         }
         result.add(currentNode.data);
         return result;
     }
}