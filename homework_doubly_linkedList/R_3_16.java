

/**
 * Created by aiman on 2/3/2022.
 */
public class R_3_16 {
    public boolean equals(DoublyLinkedList l1, DoublyLinkedList l2) {
        boolean b = false;
        if (l1.isEmpty() && l2.isEmpty()){
            System.out.println("the two lists are empty");
            return true;
        }
        if (l1.size() == l2.size()){
            int n = l1.size ();
            DoublyLinkedList.Node<E> n1 = l1.header.getNext();
            DoublyLinkedList.Node<E> n2 = l2.header.getNext();
            while (n != 0){
                if ( n1.getElement() .equals( n2.getElement())){
                    b = true;
                }
                else b=false;
                n1 = n1.getNext();
                n2 = n2.getNext();
                n--;
            }
        }return b;
    }
}
