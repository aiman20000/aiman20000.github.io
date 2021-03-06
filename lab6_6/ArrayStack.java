package lab6_6;

public class ArrayStack<E> implements Stack<E> {
    static final int CAPACITY=100;
    E data[];

    int t=-1;

    public ArrayStack(int c) {
        data=(E[])new Object[c];
    }

    public ArrayStack() {
        this(CAPACITY);

    }

    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public int size() {
        return t;
    }

    @Override
    public E top() {
        if (isEmpty()) return null;
        return data[t];
    }

    @Override
    public E pop() {
        if (isEmpty()) return null;
        E del=data[t];
        data[t]=null;
        t--;
        return del;
    }

    @Override
    public void push(E element) {
        if (size()==data.length)
            throw new IllegalStateException("Stack is full");
        data[++t]=element;
    }
}
