package utils;

import java.util.*;

public class functions {
    public node head;
    public void add_node(node n){
        if(head==null){
            head=n;
            return;
        }else{
            node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=n;
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
