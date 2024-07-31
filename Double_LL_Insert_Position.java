import java.util.Scanner;
class Double_LL_Insert_Position
{
    Node head;
    Node tail;
    class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int val)
        {
            data=val;
            next=null;
            prev=null;
        }
    }
    Double_LL_Insert_Position()
    {
        head=null;
        tail=null;
    }
    public void insertend(int val){
        Node newnode = new Node(val);

        if (head==null){
            head = newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
           }
    }
    public void middle(int pos,int k)
    {
        Node newnode=new Node(k);
        Node temp=head;
        for(int i=0;i<=pos;i++)
        temp=temp.next;
        
        newnode.prev=temp;
        newnode.next = temp.next;
        temp.next.prev=newnode;
        temp.next=newnode;
        
        
    }
    public void display()
    {
        Node temp=head;
         //System.out.print("Null");
        while(temp!=null)
        {
             System.out.print(temp.data+"<-->");
            temp = temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        Double_LL_Insert_Position list = new Double_LL_Insert_Position();

        int n = s.nextInt();
        for (int i =0 ;i<n;i++){
            int val = s.nextInt();
            list.insertend(val);
    }
    list.display();
    int pos=s.nextInt();
    int k=s.nextInt();
    list.middle(pos,k);
    list.display();
   }
}