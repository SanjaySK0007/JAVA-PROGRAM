import java.util.Scanner;
class Double_LL_Insert_End
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
    Double_LL_Insert_End()
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
        Double_LL_Insert_End list = new Double_LL_Insert_End();

        int n = s.nextInt();
        for (int i =0 ;i<n;i++){
            int val = s.nextInt();
            list.insertend(val);
    }
    list.display();
   }
}