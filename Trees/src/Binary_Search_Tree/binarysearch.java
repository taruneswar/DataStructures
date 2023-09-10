//https://www.geeksforgeeks.org/introduction-to-binary-search-tree-data-structure-and-algorithm-tutorials/
//First read above link then do binaru serach problems
package Binary_Search_Tree;
import Depth_First_Search.node;

import java.util.ArrayList;

public class binarysearch {
   static node root;
   static node insert(node root,int data){
       if(root==null){
           return new node(data);
       }
       if(data<root.data){
           root.left=insert(root.left,data);
       }else if(data> root.data){
           root.right=insert(root.right,data);
       }
       return root;
   }
   static void inorder(node root){
       if(root==null){
           return;
       }
       inorder(root.left);
       System.out.println(root.data);
       inorder(root.right);
   }
   static void leaf(node root){
       if(root==null){
           return;
       }
       if(root.left==null && root.right==null){
           System.out.println(root.data);
       }
       leaf(root.left);
       leaf(root.right);
   }
   static void right_view_tree(node root,int level){
       if(root==null){
           return ;
       }
       ArrayList<Integer> ds= new ArrayList<Integer>();
       if(level==ds.size()){
           ds.add(root.data);
       }
       right_view_tree(root.right,level+1);
       right_view_tree(root.left,level+1);
   }
    public static void main(String[] args) {
      root =insert(root,6);
        insert(root, 30);

        // inserting value 20
        insert(root, 20);

        // inserting value 40
        insert(root, 40);

        // inserting value 70
        insert(root, 70);

        // inserting value 60
        insert(root, 60);

        // inserting value 80
        insert(root, 80);
        //inorder(root);
        //leaf(root);
        right_view_tree(root,0);
    }
}
