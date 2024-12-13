
/*
array implementation of a stack
*/

public class StackArray {
    public static void main(String[] args) {
        StackArray stackArray = new StackArray(3);
        System.out.println(stackArray.push(1));
        System.out.println(stackArray.push(2));
        System.out.println(stackArray.push(3));
        stackArray.pop();
        stackArray.printValues();
        System.out.println(stackArray.isEmpty());
        System.out.println(stackArray.peek());
    }

    private int[] _valuesArray;
    private int _currentIndex = -1;
    public StackArray(int size) {
        _valuesArray = new int[size];
    }

    public Boolean push(int newValue) {
        if(_currentIndex < _valuesArray.length-1) {
            _valuesArray[++_currentIndex] = newValue;
            return true;
        } else {
            return false;
        }
    }

    public void printValues() {
        for(int i = _currentIndex; i != 0; i--) {
            System.out.println(_valuesArray[i]);
        }
    }

    public boolean pop() {
        if(_currentIndex != 0) {
        _valuesArray[_currentIndex-1] = 0;
        return true;
        } else { return false;}
    }

    public boolean isEmpty() {
        return _currentIndex != 0;
    }

    public int peek() {
        return _valuesArray[_currentIndex-1];
    }
}