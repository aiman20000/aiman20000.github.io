package HOME_Work_Fatma;

import Lab3_3.SingleLinkedList;
import javax.xml.soap.Node;

public class Wq2<E> {
    private SingleLinkedList.Node<E> head=null;
    private SingleLinkedList.Node<E> tail=null;
    private int size=0;

    public Wq2() {
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
        head=new SingleLinkedList.Node<E>(e,head);
        if (size==0)
            tail=head;
        size++;
    }
    public void addLast(E e)
    {
        SingleLinkedList.Node<E> newest=new SingleLinkedList.Node<E>(e,null);
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
    //HOME WORK Q2
    public int sizehomework() {
        SingleLinkedList.Node<E> tmp = head;
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
        SingleLinkedList.Node<E> next;

        public Node(E element, SingleLinkedList.Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }


        public SingleLinkedList.Node<E> getNext() {
            return next;
        }

        public void setNext(SingleLinkedList.Node<E> next) {
            this.next = next;
        }
    }


}

