

import lab4_4.CircularyLinkedList;

/**
 * Created by aiman on 18/2/2022.
 */
public class R_3_7 {

    public void addFirst(E e){  e stands for Element
        if (isEmpty()){
            tail=new CircularyLinkedList.Node<E>(e,null);
            tail.setNext(tail);
        }
        else {
            tail.next=new CircularyLinkedList.Node<E>(e,tail.getNext());  rather than creating new node
        }
    }
}
