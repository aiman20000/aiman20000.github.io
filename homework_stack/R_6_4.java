

import java.util.Stack;

/**
 * Created by aiman on 15/2/2022.
 */
public class R_6_4 {

    public static Stack trnsfare(Stack S1, Stack S2){
        for (int i = 0; i < 5; i++) {
            S1.push(i);
        }
        System.out.println("Stack s before popped to Stack t:"+S1+" Size= "+S1.size());
        while (!S1.isEmpty()){
            S2.push(S1.pop());
        }
        System.out.println("Stack s is popped to Stack t :"+"size= "+ S1.size());

        return S2;
    }

    public static void main(String[] args) {
        Stack <Integer> S=new Stack<>();
        Stack <Integer> T=new Stack<>();
        System.out.println(trnsfare(S,T));

    }
}
