import java.util.Iterator;

public class DynamicArray <T> implements Iterable<T>{
    private T[] arr;
    private int len = 0;
    private int capacity = 0;
    public DynamicArray() {this(16);}
    public DynamicArray(int capacity) {
        if(capacity < 0 ) throw new IllegalArgumentException("Illegal capacity");
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    public int size() { return this.len;}
    public boolean isEmpty() {return size() == 0;}
    public T get(int index) {return arr[index];}
    public void set(int index, T element) {arr[index] = element;}
    public void clear() {
        for(int i = 0; i<len; i++ ) {
            arr[i] = null;
        }
        len = 0;
    }

    public void add(T element) {
        if(len+1 >= capacity) { // resize array
            // adjust the capacity
            if(capacity == 0) capacity = 1;
            else capacity *= 2; // double the capacity
            T[] tempArray = (T[]) new Object[capacity];
            for(int i = 0; i< len; i++) {
                tempArray[i] = arr[i];
            }
            arr = tempArray;
        }
        arr[len++] = element;
    }

    public T removeAt(int rm_index) {
        if(rm_index >= len || rm_index < 0) {throw new IllegalArgumentException("illegal index specified");}
        T data = arr[rm_index];
        T[] new_arr = (T[]) new Object[len-1];
        for(int i=0, j=0; i<len; i++, j++) {
            if(i == rm_index) j--; 
            new_arr[j] = arr[i];
        }
            arr = new_arr;
            capacity = --len;
            return data;
    }
    public boolean remove(Object obj) {
        for(int i = 0; i< len; i++) {
            if(arr[i].equals(obj)) {
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object obj) {
        for(int i = 0; i< len; i++ ){ 
            if(arr[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }
    @Override
    public Iterator<T> iterator() {
        return new Iterator <T> () {
            int index = 0;
            public boolean hasNext() {return index < len;}
            public T next() {return arr[index++];}
        };
    }
}
