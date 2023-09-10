import java.lang.reflect.Array;
import java.util.*;
import utils.*;
//Write a GetNth() function that takes a linked list and an integer index and returns the data value stored in the node at that index position.
//
//Example:
//
//Input:  1->10->30->14,  index = 2
//Output: 30
//The node at index 2 is 30
public class Get_Nth_In_LL {
    public int getNth(ArrayList<Integer> li,int i){
        return li.get(i);
    }
    public static void main(String[] args) {
        Get_Nth_In_LL g=new Get_Nth_In_LL();
        functions f=new functions();
        f.add_node(new node(1));
        f.add_node(new node(10));
        f.add_node(new node(30));
        f.add_node(new node(14));
        ArrayList<Integer> li=new ArrayList<>();
        node temp=f.head;
        while(temp!=null){
            li.add(temp.data);
            temp=temp.next;

        }
        System.out.println(g.getNth(li,2));

    }
}
