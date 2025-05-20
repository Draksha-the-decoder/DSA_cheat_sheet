import java.io.*; 
public class LinkedList { 
    static Node head;
    static class Node 
    {   
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
    public static LinkedList insertatfirst(LinkedList list, int data) 
    { 
        Node new_node = new Node(data); 
        new_node.next = head;
        head = new_node;
        return list; 
    }  
    public static LinkedList insertatlast(LinkedList list, int data) 
    { 
        Node new_node = new Node(data); 
        if(head == null)
            head = new_node; 
        else 
        { 
            Node temp = head; 
            while (temp.next != null)
                temp = temp.next;  
            temp.next = new_node; 
        } 
        return list; 
    }  
    public static LinkedList insertatindex(LinkedList list, int data, int index) 
    { 
        Node new_node = new Node(data);
        Node temp = head;
        while(index-- > 1)
            temp = temp.next;
        new_node.next=temp.next;
        temp.next=new_node;
        return list;
    }
    public static void insertbeforeval(LinkedList list, int data, int val) 
    { 
        Node new_node = new Node(data);
        Node temp = head;
        while(temp.next.data != val)
        {
            temp = temp.next;
        }
        new_node.next=temp.next;
        temp.next=new_node;
    }
    public static void deleteindex(LinkedList list, int index) 
    { 
         if(index == 0)
        {
            head = head.next;
        }
        else{
        Node temp = head;
        while(index-- > 1)
            temp = temp.next;
        temp.next=temp.next.next;
        }
    }
     public static void deleteval(LinkedList list, int val) 
    { 
        Node temp = head;
        if(head.data == val)
        head = head.next;
        else{
        while(temp.next.data != val)
        {
            temp = temp.next;
        }
        temp.next=temp.next.next;
        }
    } 
     public static void reverse(LinkedList list) 
    { 
        Node prev = null;
        Node after = null;
        while(head!=null)
        {
            after=head.next;
            head.next=prev;
            prev=head;
            head = after;
        }
        head=prev;
    }   
    public static void main(String[] args) 
    { 
        LinkedList list = new LinkedList(); 
        list = insertatlast(list, 1); 
        list = insertatlast(list, 2); 
        list = insertatlast(list, 3); 
        list = insertatlast(list, 4);  
        printList(list); 
        insertatindex(list,7,2);
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
