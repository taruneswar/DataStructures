package Breadth_first_search;
import Depth_First_Search.node;
import java.util.*;
import java.util.LinkedList;

//Time Complexity: O(N) where n is the number of nodes in the binary tree.
//Auxiliary Space: O(N) where n is the number of nodes in the binary tree.

public class  Level_Order_Using_Queue{
    node root;
    void printlevel(){
        Queue<node> q =new LinkedList<node>();
        q.add(root);
        while(!q.isEmpty()){
            root=q.poll();
            System.out.print(root.data+" ");
            if(root.left!=null){
                q.add(root.left);
            }
            if(root.right!=null)
                q.add(root.right);
        }
    }
    public static void main(String[] args) {
        Level_Order_Using_Queue tree = new Level_Order_Using_Queue();
        tree.root=new node(1);
        tree.root.left = new node(2);
        tree.root.right = new node(3);
        tree.root.left.left = new node(4);
        tree.root.left.right = new node(5);
        tree.printlevel();
    }
}
