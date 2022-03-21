
/**
 * Created by aiman on 19/3/2022.
 */
public class R_6_15 {

             public static <E> E Josephus(CircularQueue<E> queue, int k) {
        if (queue.isEmpty( )) return null;
         while (queue.size( ) > 1) {
             for (int i=0; i < k−1; i++) // skip past k-1 elements
             queue.rotate( );
             E e = queue.dequeue( ); // remove the front element from the collection
            System.out.println(" " + e + " is out");
            }
         return queue.dequeue( ); // the winner
         }


            15 public static <E> CircularQueue<E> buildQueue(E a[ ]) {
         CircularQueue<E> queue = new LinkedCircularQueue<>( );
         for (int i=0; i<a.length; i++)
             queue.enqueue(a[i]);
        return queue;
        }


             public static void main(String[ ] args) {
         String[ ] a1 = {"aiman", "ahmed", "seed", "amjad", "aseel", "osama"};
         String[ ] a2 = {"ali", "sadeq", "alawi", "salah", "Kreem", "mhoamad"};
         String[ ] a3 = {"hamza", "hassen"};
         System.out.println("First winner is " + Josephus(buildQueue(a1), 3));
         System.out.println("Second winner is " + Josephus(buildQueue(a2), 10));
         System.out.println("Third winner is " + Josephus(buildQueue(a3), 7));
         }
 }
