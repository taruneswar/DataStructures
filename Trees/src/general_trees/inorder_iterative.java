package general_trees;
import Depth_First_Search.node;

import java.util.Stack;

public class inorder_iterative {
    void printlevel(){
        Stack<node> st =new Stack<node>();

        while(true){
           if(root!=null){
               st.push(root);
               root=root.left;
           }else{
               if(st.isEmpty()){
                   break;
               }
               root=st.pop();
               System.out.println(root.data);
               root=root.right;
           }
        }
    }
    node root;
    public static void main(String[] args) {
        inorder_iterative tree= new inorder_iterative();
        tree.root=new node(1);
        tree.root.left = new node(2);
        tree.root.right = new node(3);
        tree.root.left.left = new node(4);
        tree.root.left.right = new node(5);
        tree.printlevel();
    }

}
