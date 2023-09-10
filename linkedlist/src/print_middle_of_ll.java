import java.util.*;
import utils.*;
//Given a singly linked list, find the middle of the linked list. For example,
// if the given linked list is 1->2->3->4->5 then the output should be 3.
public class print_middle_of_ll {
    public static void main(String[] args) {
        print_middle_of_ll n =new print_middle_of_ll();
        functions i =new functions();
        i.add_node(new node(4));
        i.add_node(new node(5));
        i.add_node(new node(6));
        i.add_node(new node(8));

        ArrayList<Integer> li=new ArrayList<>();
        node current=i.head;
        while(current!=null){
            li.add(current.data);
            current=current.next;
        }
        System.out.println(li.get(li.size()/2));

    }
}
