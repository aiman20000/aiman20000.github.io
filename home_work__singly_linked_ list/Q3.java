/////////Q3.25//////////////

/**
 * Created by aiman on 2/1/2022.
 */
public class Q3 {
   public Singly_Linked_List<Integer>Concatenating_tow_lists(Singly_Linked_List<Integer>list1,Singly_Linked_List<E>list2){
       list1.tail.setNext(list2.head);
       list1.size=list1.size+list2.size;
       return list1;
    }}
