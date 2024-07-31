import java.util.*;
class Double_LL_Delete_End{
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int val)
        {
            data=val;
            prev=null;
            next=null;
        }
    }
    Double_LL_Delete_End(){
        head=null;
        tail=null;
    }
    public void insertend(int val)
    {
        Node newnode=new Node(val);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else
        {
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
    }
    public void dlast()
    {
        Node temp=tail;
        Node temp2=tail.prev;
        temp.prev.next=null;
        temp.prev=null;
        tail=temp2;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"<--->");
            temp=temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Double_LL_Delete_End list=new Double_LL_Delete_End();
        int a=s.nextInt();
        for(int i=0;i<a;i++)
        {
            int val=s.nextInt();
            list.insertend(val);
        }
        list.display();
        list.dlast();
        list.display();

    }
}
