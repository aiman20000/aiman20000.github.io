package lab6_6;

public class LinkedStack<E> implements Stack<E> {
    SingleLinkedList<E> list=new SingleLinkedList<>();
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E top() {
        return list.first();
    }

    @Override
    public E pop() {
        return list.removefirst();
    }

    @Override
    public void push(E element) {
        list.addFrist(element);

    }
}
