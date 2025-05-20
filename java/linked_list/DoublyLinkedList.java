import java.io.*; 
public class DoublyLinkedList { 
    static Node head;
    static class Node 
    {   
        int data; 
        Node next;
        Node prev; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
            prev = null;
        } 
    } 
    public static void insertatfirst(LinkedList list, int data) 
    { 
        Node new_node = new Node(data); 
        if(head == null)
        head = new_node;
        else{
        new_node.next = head;
        head.prev = new_node;
        head = new_node;
        }
    }  
    public static void insertatlast(LinkedList list, int data) 
    { 
        Node new_node = new Node(data); 
        if(head == null)
        head = new_node;
        else{
            Node temp = head;
            while(temp.next!=null)
            temp = temp.next;
            temp.next = new_node;
            new_node.prev = temp;            
        }
    }  
    public static void insertatindex(LinkedList list, int data, int index) 
    { 
        Node new_node = new Node(data);
        Node temp = head;
        while(index-- >1)
        temp=temp.next;
        new_node.next=temp.next;
        new_node.prev=temp;
        temp.next.prev = new_node;
        temp.next= new_node;
    }
    public static void insertbeforeval(LinkedList list, int data, int val) 
    { 
        Node new_node = new Node(data);
    }
    public static void deleteindex(LinkedList list, int index) 
    { 
        if(index == 0)
        {
            head = head.next;
            head.prev=null;
        }
        else{
            Node temp = head;
            while(index-->0)
              temp=temp.next;
            
            if(temp.next == null)
                temp.prev.next=null;
            else
            {
                temp.next.prev = temp.prev;
                temp.prev.next = temp.next;
            }            
        }
    }
     public static void deleteval(LinkedList list, int val) 
    { 
        Node temp = head;
    } 
     public static void reverse(LinkedList list) 
    { 
        if (head == null || head.next == null)
            return;  

        Node back = null;
        Node current = head;
        while (current != null) 
        {          
            back = current.prev;    
            current.prev = current.next;     // Swap the previous and next pointers             
            current.next = back;       

            current = current.prev;   // Move to the next node in the orignal list 
        }
        head=back.prev;
    }   
    public static void main(String[] args) 
    { 
        LinkedList list = new LinkedList(); 
        insertatfirst(list, 1); 
        insertatlast(list, 2); 
        insertatlast(list, 3); 
        insertatlast(list, 4);  
        printList(list); 
        reverse(list);
        printList(list);
    } 
    public static void printList(LinkedList list) 
    { 
        Node currNode = head; 
        System.out.print("LinkedList: "); 
        while (currNode != null) 
        {  
            System.out.print(currNode.data + " "); 
             currNode = currNode.next; 
        } 
        System.out.println();
    } 
} 
