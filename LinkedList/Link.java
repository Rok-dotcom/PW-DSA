/// 19 jan 2026


package LinkedList;

public class Link {



    // method for adding node at the end of the node
    public static void insertAtEnd(node head,int val){
        node temp = head;
        node t = new node(val);
        while(temp.next != null){
             temp = temp.next;
        }
        temp.next = t;
    }


    // by using recursion
    public static void displayr(node head){
        if(head == null) return;
        System.out.print(head.data+" ");
        displayr(head.next);
    }


    // by using function
    public static void display(node head){
         node temp = head;
         while(temp != null){
              System.out.print(temp.data+" ");
              temp = temp.next;
         }

    }

     public static class node {
       int data;
       node next;
       node(int data){
           this.data = data;
       }

     }

      public static void main(String[] args){
         node a = new node(5);  // head
         node b = new node(2);
         node c = new node(3);
         node d = new node(8);  // tail
         // 5 2 3 8
         // this is singly LinkedList

         a.next = b; // 5 -> 2 3 8
         b.next = c; // 5 -> 2 -> 3 8
         c.next = d; // 5 -> 2 -> 3 -> 8
/*
         System.out.println(a.data);
         System.out.println(a.next.data);
         System.out.println(a.next.next.data);
         System.out.println(a.next.next.next.data);
*/
         // how can I print this by using loop
         // there is next which is increasing by +1 by everytime.
         //

         // By function
//         display(a);
//         System.out.println();
//         displayr(a);
//         System.out.println();

           insertAtEnd(a,87);
           display(a);
      }
}
