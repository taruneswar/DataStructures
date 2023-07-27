package Breadth_first_search;
//TC O(N^2) SC:O(N) This is for a skewed tree
//TC O(N) SC:O(N) This is for a Balanced tree
import Depth_First_Search.node;
public class Levelorder_traversal  {
    node root;
    void printLevelorder(){
        int h=height(root);int i;
        for(i=1;i<=h;i++){
            printlevel(root,i);
        }
    }
    int height(node root){
        if(root==null){
            return 0;
        }
        else{
            int l=height(root.left);
            int r=height(root.right);
            if(l>r){
                return (l+1);
            }else{
                return (r+1);
            }
        }
    }
    void printlevel(node root,int level){
        if(root==null){
            return;
        }
        if (level==1){
            System.out.println(root.data+" ");
        }else if(level>1){
            printlevel(root.left,level-1);
            printlevel(root.right,level-1);

        }
    }
    public static void main(String[] args) {
        Levelorder_traversal tree = new Levelorder_traversal();
        tree.root=new node(1);
        tree.root.left = new node(2);
        tree.root.right = new node(3);
        tree.root.left.left = new node(4);
        tree.root.left.right = new node(5);
        tree.printLevelorder();
    }
}
