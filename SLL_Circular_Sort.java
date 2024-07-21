import java.util.Scanner;
public class SLL_Circular_Sort{
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
    SLL_Circular_Sort(){
        last = null;
    }
    public void create(int val){
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
    public void sort() {
        Node current = last;
        Node index = null;
        int temp;

        if (last == null) {
            return;
        } else {
            do {
                index = current.next;
                while (index != last) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data; 
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            } while (current != last);
        }
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
        SLL_Circular_Sort list = new SLL_Circular_Sort();
        
        int m = sc.nextInt();
        for (int i =0 ;i<m;i++){
            int val = sc.nextInt();
            list.create(val);
        }
        list.sort();
        list.display();
    }
}