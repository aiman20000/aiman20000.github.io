

import java.util.stack;

/**
 * Created by aiman on 15/2/2022.
 */
public class R_6_5 {
    public static stack <Integer>popAllRecursive(stack stack) {

        if(stack.isEmpty()) {
           
            return null;
        }
        stack.pop();  

        popAllRecursive(stack); 

        return stack;
    }

    public static void main(string[] args) {
        stack<Integer> stack =new stack<Integer>();
        for (int i = 0; i <5 ; i++) {
            stack.push(i);
        }
        system.out.println("stack before popped:"+stack);
        system.out.println("stack elements are popped:"+popAllRecursive(stack));

    }
}
