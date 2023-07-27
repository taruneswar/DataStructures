package Depth_First_Search;





public class postorder_traversal {
    node root;

    void printPreorder(node n){
        if(n==null){
            return;
        }

        printPreorder(n.left);
        printPreorder(n.right);
        System.out.print(n.data+" ");

    }
    void printPreorder(){
        printPreorder(root);
    }
    public static void main(String[] args) {
        postorder_traversal tree = new postorder_traversal();
        tree.root = new node(1);
        tree.root.left = new node(2);
        tree.root.right = new node(3);
        tree.root.left.left = new node(4);
        tree.root.left.right = new node(5);
        tree.printPreorder();
    }
}

