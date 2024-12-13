public class StaticArrayQueue {
    private int[] queueRep;
    private int size, front, rear;

    private static final int CAPACITY = 16;
    public FixedSizeArrayQueue() {
        queueRep = new int[CAPACITY];
        size = 0; front = 0; rear = 0;
    }
    public FixedSizeArrayQueue(int capacity) {
        queueRep = new int[capacity];
        size = 0; front = 0; rear = 0;
    }

    public void enQueue(int data) throws NullPointerException, IllegalStateException {
        if(size==CAPACITY) {
            throw new IllegalStateException();
        } else {
            size++;
            queueRep[rear] = data;
            rear = (rear+1) % CAPACITY;
        }
    }

    public int deQueue() throws IllegalStateException {
        if(size==0) {
            throw new IllegalStateException();
        } else {
            size--;
            int data = queueRep[(front%CAPACITY)];
            queueRep[front] = Integer.MIN_VALUE;
            front = (front+1)%CAPACITY;
            return data;
        }
    }
        public boolean isEmpty() {
            return (size==0);
        }
        public boolean isFull() {
            return size==CAPACITY;
        }
        public int size() {
            return size;
        }
    }

