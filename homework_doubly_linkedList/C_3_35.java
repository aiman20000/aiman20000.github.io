
/**
 * Created by aiman on 2/3/2022.
 */
public class C_3_35 {
    public DoublyLinkedList_Q3<E> clone() throws CloneNotSupportedException {
       
        DoublyLinkedList_Q3<E> other = (DoublyLinkedList_Q3<E>) super.clone();
        if (size > 0) {                       
            other.header = new DoublyLinkedList_Q3.Node<>(null, null, null);
            other.trailer = new DoublyLinkedList_Q3.Node<>(null, other.header, null);
            other.header.setNext(other.trailer);
            DoublyLinkedList_Q3.Node<E> walk = header.getNext();   
            DoublyLinkedList_Q3.Node<E> otherWalk = other.header;
            for(int i = 0; i < size; i++) {           
                DoublyLinkedList_Q3.Node<E> newest = new DoublyLinkedList_Q3.Node<>(walk.getElement(), null, null);
                otherWalk.setNext(newest);   
                otherWalk = newest;
                otherWalk.setPrev(newest);   
                walk = walk.getNext();
            }
        }
        return other;
    }
}
