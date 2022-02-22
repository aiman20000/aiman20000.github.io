package lab6_6;

public class SingleLinkedList<E> {
    private Node<E> head=null;
    private Node<E>tail=null;
    private int size=0;

    public SingleLinkedList() {
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public int size()
    {
        return size;
    }
    public E first()
    {
        if (isEmpty())
            return null;
        return head.getElement();
    }
    public E last()
    {
        if (isEmpty())
            return null;
        return tail.getElement();
    }
    public void addFrist(E e)
    {
        //or size++;
        head=new Node<E>(e,head);
        if (size==0)
            tail=head;
        size++;
    }
    public void addLast(E e)
    {
        Node<E>newest=new Node<E>(e,null);
        if (isEmpty())
            head=newest;
        else
            tail.setNext(newest);
        tail=newest;
        size++;
    }
    public E removefirst()
    {
        if (isEmpty())
            return null;
        E x= head.getElement();
        head=head.getNext();
        size--;
        if (size==0)
            tail=null;
        return x;
    }
    public int sizehomework() {
        Node<E> tmp = head;
        int size = 0;
        if (head == null) {
            return size;
        } else {
            size++;
            while (tmp.next != null) {
                tmp = tmp.next;
                size++;
            }
        }
        return size;
    }


    public static class Node<E>
    {
        private E element;
        Node<E>next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }


        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }


}
