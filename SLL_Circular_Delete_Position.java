import java.util.Scanner;

public class SLL_Circular_Delete_Position{
    Node last;
    
    class Node{
        int data;
        Node next;
        //Node head;
        
        Node(int val){
            data = val;
            next = null;
            //head = null;
        }
    }
    SLL_Circular_Delete_Position(){
        last = null;
    }
    public void insertbegin(int val){
        Node newnode = new Node(val);
         
        if (last==null){
            newnode.next=newnode;
            last=newnode;
        }
        else{
            newnode.next=last.next;
            last.next=newnode;
            last=newnode;
        }
    }
    public void dpos(int pos){
        Node temp; 
        Node prev;
        temp=last.next;
        prev=last;
        for(int i=0;i<pos-1;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
    }
    public void display(){
        Node temp = last.next;
        
        do{
            System.out.print(temp.data+"-->");
            temp =temp.next;
        }
        while(temp!=last.next);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        SLL_Circular_Delete_Position list = new SLL_Circular_Delete_Position();
        
        int m = sc.nextInt();
        for (int i =0 ;i<m;i++){
            int val = sc.nextInt();
            list.insertbegin(val);
        }
        int v=sc.nextInt();
        list.dpos(v);
        list.display();
    }
}