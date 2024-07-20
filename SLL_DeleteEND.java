import java.util.Scanner;
public class SLL_DeleteEND{
	    Node head;
	    class Node{
	        int data;
	        Node next;
	        Node(int val){
	            data = val;
	            next = null;
	            //head = null;
	        }
	    }
	    SLL_DeleteEND(){
	        head = null;
	    }
	    public void insertend(int val){
	        Node newnode = new Node(val);
	         
	        if (head==null){
	            head = newnode;
	        }
	        else{
	            Node temp = head;
	            while(temp.next != null){
	                temp =  temp.next;       
	            }
	            temp.next = newnode;
	        }
	    }
        void delete_end(){
            Node temp=head;
           // Node prev = null;
            while(temp.next.next!=null){
               // prev = temp;
                temp=temp.next;
            }
            temp.next=null;
        }
	    public void display(){
	        Node temp = head;
	        
	        while(temp != null){
	            System.out.print(temp.data+"-->");
	            temp = temp.next;
	        }
	        System.out.println("Null");
	    }
	    public static void main(String args[]){
	        Scanner sc = new Scanner (System.in);
	      SLL_DeleteEND list = new  SLL_DeleteEND();
	        int m = sc.nextInt();
	        for (int i =0 ;i<m;i++){
	            int val = sc.nextInt();
	            list.insertend(val);
	        }
           list.delete_end();
           list.display();
	    }   
	}