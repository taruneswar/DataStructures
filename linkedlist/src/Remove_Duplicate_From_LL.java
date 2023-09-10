import java.util.*;
import utils.*;
//Write a function that takes a list sorted in non-decreasing order and deletes any duplicate nodes from the list. The list should only be traversed once.
//For example if the linked list is 11->11->11->21->43->43->60 then removeDuplicates() should convert the list to 11->21->43->60.

public class Remove_Duplicate_From_LL {
    public static void removedup(node r){
        node curr=r;
        while(curr!=null){
            
        }

    }
    public static void main(String[] args) {
        functions f =new functions();
        f.add_node(new node(11));
        f.add_node(new node(11));
        f.add_node(new node(11));
        f.add_node(new node(21));
        f.add_node(new node(43));
        f.add_node(new node(43));
        f.add_node(new node(60));
        node root=f.head;
        removedup(root);
    }
}
