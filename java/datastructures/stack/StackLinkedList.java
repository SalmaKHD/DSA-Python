public class StackLinkedList {
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.printValues();
        stack.pop();
        stack.pop();
        stack.printValues();
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }

    private Node _current = null;
    public class Node {
        int _value;
        Node _next = null;

        public Node(int value) {
            _value = value;
        }
    }

        public boolean push(int value) {
            if(_current == null) {
                _current = new Node(value);
            } else {
                // make the ._next property of the new node point to the older _current node
                Node newNode = new Node(value);
                temp.next = _current;
                _currnt = newNode;
            }
            return true;
        }
        
        public void printValues() {
            Node currentNode = _current;
            while(currentNode != null) {
            System.out.println(currentNode._value);
            currentNode = currentNode._next;
            }
        }

        public boolean pop() {
            if(_current != null) {
                _current = _current._next;
                return true;
            } else {
                return false;
            }
        }

        public int peek() {
            if(_current != null) {
                return _current._value;
            } else {
                return -1;
            }
        }
        
        public boolean isEmpty() {
            return _current != null;
        }
    }