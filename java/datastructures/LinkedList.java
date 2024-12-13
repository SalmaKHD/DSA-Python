public class LinkedList {
    private Node head;
    static public void main(String args[]) {
        LinkedList linkedList = new LinkedList();
       LinkedList.insert(linkedList, 2);
       LinkedList.insert(linkedList, 4);
       printList(linkedList);   
       //LinkedList.deleteNode(linkedList, 2);
     //  LinkedList.deleteNode(linkedList, 4);
      LinkedList.deleteByPosition(linkedList, 0);
       LinkedList.printList(linkedList);
    }

    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            next = null;
        } 
    }

    public static LinkedList insert(LinkedList linkedList, int value) {
        Node newNode = new Node(value);
        if(linkedList.head == null) {
            linkedList.head = newNode;
        }
        else {
            Node last = linkedList.head;
            while(last.next !=null) {
                last = last.next;
            }
        last.next = new Node(value);
        }
        return linkedList;
    }

    public static void printList(LinkedList linkedList) {
        Node node = linkedList.head;
        while(node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    public static boolean deleteNode(LinkedList linkedList, int value) {
        Node previousNode = null;
        Node currentNode = linkedList.head;
        // totally custom implementation
        while (currentNode!=null) {
            if (currentNode.value == value && currentNode == linkedList.head) {
                linkedList.head = currentNode.next;
                return true;
            } else if (currentNode.value == value) {
                 previousNode.next = currentNode.next;
                return true;
            } else {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
        }
        return false;
    }

    public static boolean deleteByPosition(LinkedList linkedList, int position) {
        Node currentNode = linkedList.head;
        Node previousNode = null;
        for(int i = 0; i<=position && currentNode!=null; i++) {
            if(position == 0) {
                linkedList.head = linkedList.head.next;
                return true;
            } else if(i==position) {
                previousNode.next = currentNode.next;
                return true;
            }
            else {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
        }
        return false;
    }

    public reverse(Node node) {
        if(head == null || head.next == null) {
            return head;
        }
        Node rest = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }


    public Node reverseIterative(Node node) {
        Node = prev = null;
        Node current = node;
        Node next = null;
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        node = prev;
        return node;
    }
}