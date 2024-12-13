public class QueueLinkedList {
    static public void main(String[] args) {
        QueueLinkedList list = new QueueLinkedList();
        list.enqueue(65);
        list.enqueue(76);
        list.enqueue(30);
        list.printValues();
        list.dequeue();
        list.dequeue();
        list.printValues();
        list.dequeue();
        list.printValues();
        list.dequeue();
        list.printValues();
    }

    Node _front = null;
    Node _rear = null;

    public class Node {
        int _value;
        Node _next = null;

        public Node(int value) {
            _value = value;
        }
    }

    public void enqueue(int value) {
        if(_front == null) {
                _front = _rear = new Node(value);
            
        } else {
            _rear._next = new Node(value);
            this._rear = _rear._next;
        }
    }

    public int dequeue() {
        // 1 or 0 elements
        if(_front == _rear) {
            _front = _rear = null;
            return 1;
        } else {
            // process and skip the first node
            _front = _front._next;
            if(_front == null) {_rear = null;}
            return 1;
        }
    }

    public void printValues() {
        if(_front != null) {
            Node currentNode = _front;
            while(currentNode!=null) {
                System.out.println(currentNode._value);
                currentNode = currentNode._next;
            }
        }
    }

    public boolean isEmpty() {
        return _front != null;
    }
}
