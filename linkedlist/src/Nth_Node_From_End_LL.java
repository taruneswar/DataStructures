import java.util.*;
import utils.*;
//Given a Linked List and a number N, write a function that returns the value at the Nth node from the end of the Linked List.
//Input: 1 -> 2 -> 3 -> 4, N = 3
//Output: 2
//
//Input: 35 -> 15 -> 4 -> 20, N = 4
//Output: 35
public class Nth_Node_From_End_LL {
    public static int nthnode(ArrayList<Integer> li,int d){
        return li.get(li.size()-d);

    }
    public static void main(String[] args) {
        functions f= new functions();
        f.add_node(new node(35));
        f.add_node(new node(15));
        f.add_node(new node(4));
        f.add_node(new node(20));
        ArrayList<Integer> li =new ArrayList<>();
        node current=f.head;
        while(current!=null){
            li.add(current.data);
            current=current.next;
        }
        System.out.println(nthnode(li,4));

    }
}
