package utils;

import java.util.*;

public class functions {
    node head;
    public void add_node(node n){
        if(head==null){
            head=n;
            return;
        }else{
            while(head.next!=null){
                head=head.next;
            }
            head.next=n;
        }
    }
    public void printnode(){
        node root=head;
        while(root!=null){
            System.out.print(root.data+" ");
            root=root.next;
        }
    }
}
