import utils.node;

public class Identical_Linked_Lists {
    node head;
    public void printnode(){
        node root=head;
        while(root!=null){
            System.out.print(root.data+" ");
            root=root.next;
        }
    }
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
    public void first_add(node n){
        n.next=head;
        head=n;
    }
    public void insert_end(node n){
        node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=n;
        n.next=null;
    }
    public static boolean identical(Identical_Linked_Lists i,Identical_Linked_Lists i1){
        node a=i.head;node b=i1.head;
        while(a!=null && b!=null){
            if(a.data!=b.data){
                return false;
            }
            a=a.next;
            b=b.next;
        }
        return (a==null && b==null);

    }
    public static void main(String[] args) {
        Identical_Linked_Lists i=new Identical_Linked_Lists();
        Identical_Linked_Lists i1=new Identical_Linked_Lists();
        i.add_node(new node(5));
        i.add_node(new node(3));
        i.first_add(new node(4));
        i.first_add(new node(5));
        i.insert_end(new node(9));
//        i.printnode();
        System.out.println();
        i1.add_node(new node(5));
        i1.add_node(new node(6));
        i1.first_add(new node(4));
        i1.first_add(new node(5));
        i1.insert_end(new node(9));
//        i1.printnode();
        if(identical(i,i1)==true){
            System.out.println("Yes they are identical");
        }else{
            System.out.println("No");
        }

    }
}
