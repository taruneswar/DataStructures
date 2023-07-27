package general_trees;
import Depth_First_Search.node;

public class height_of_a_BT {
    node root;
    public static int height(node root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static void main(String[] args) {
        height_of_a_BT tree =new height_of_a_BT();
        tree.root=new node(1);
        tree.root.left = new node(2);
        tree.root.right = new node(3);
        tree.root.left.left = new node(4);
        tree.root.left.right = new node(5);
        System.out.println(height(tree.root));
    }
}
