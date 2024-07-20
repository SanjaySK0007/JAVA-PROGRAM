import java.util.Scanner;

public class SLL_Circular_Insert_Position{
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
    SLL_Circular_Insert_Position(){
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
    public void position(int pos , int k){
        Node newnode = new Node(k);
        
        Node temp = last;
        
        for (int i =1;i<pos;i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
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
        SLL_Circular_Insert_Position list = new SLL_Circular_Insert_Position();
        
        int m = sc.nextInt();
        for (int i =0 ;i<m;i++){
            int val = sc.nextInt();
            list.insertbegin(val);
        }
        int pos=sc.nextInt();
        int k=sc.nextInt();

        list.position(pos, k);
        list.display();
    }
}