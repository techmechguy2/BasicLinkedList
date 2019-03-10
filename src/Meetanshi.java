class Node{
    int data;
     Node next;


}
class Linkedlist{
    Node head;
    public void insert(Node newnode)
    {
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node temp=head;
            head=newnode;
            newnode.next=temp;
        }
    }
    public void deletion()
    {
        Node temp=head;
        head=temp.next;
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("llist is empty");
        }
        else
        {
            System.out.println("My list is");
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"--->");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String args[])
    {
        Linkedlist obj= new Linkedlist();
        Node n1=new Node();
        n1.data=10;
        n1.next=null;
        obj.insert(n1);
        obj.display();
        Node n2=new Node();
        n2.data=20;
        n2.next=null;
        obj.insert(n2);
        obj.display();
        Node n3=new Node();
        n3.data=30;
        n3.next=null;
        obj.insert(n3);
        obj.display();
        obj.deletion();
        obj.display();
    }
}