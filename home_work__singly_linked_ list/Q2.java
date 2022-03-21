/////////// Q3.9//////////////


 /* Created by aiman on 2/1/2022.
 */
public class Q2 {

    public int size_not_as_instance(){
        Node<E>n=head;
        int size=0;
        if (head==null)return size;
        while (n!=null){
            n=n.getNext();
            size++;
        }
       return size;
    }

}
