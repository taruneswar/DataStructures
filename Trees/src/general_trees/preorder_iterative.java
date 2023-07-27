package general_trees;

import Depth_First_Search.node;

import java.util.Stack;

public class preorder_iterative {
    node root;
    void printlevel(){
        Stack<node> st =new Stack<node>();
        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            System.out.print(root.data+" ");
            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left!=null)
                st.push(root.left);
        }
    }

    public static void main(String[] args) {
        preorder_iterative tree= new preorder_iterative();
        tree.root=new node(1);
        tree.root.left = new node(2);
        tree.root.right = new node(3);
        tree.root.left.left = new node(4);
        tree.root.left.right = new node(5);
        tree.printlevel();
    }
}
