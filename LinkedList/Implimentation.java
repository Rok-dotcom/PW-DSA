/// 20 jan 2026
/// Insert element at the end of the linked list.

package LinkedList;

public class Implimentation {


/// template
     public static class node{
        int data;
        node next;

        node(int data){
         this.data = data;
        }
     }


     /// linkedlist as a data structure
     public static class linkedlist{
           node head = null;
           node tail = null;

/// to delete the element
          void deleteAt(int idx){

              if(idx == 0){
                 head = head.next;
                 return;
              }
              node temp = head;

              for(int i=1; i<=idx-1; i++){
                  temp = temp.next;
              }
              temp.next = temp.next.next;
//              temp.next.next = tail;  // is index is last
          }



/// to get element at given index
           int getElementAt(int idx){
                node temp = head;
                for(int i=1; i<= idx; i++){
                    temp = temp.next;
                }
                return temp.data;

           }

/// insert the element at given index
           void insertAt(int idx,int val){
                node t = new node(val);
                node temp = head;
                if(idx == 0){
                   insertAtStart(val);
                   return;
                }
                if(idx == size()){
                  insertAtEnd(val);
                  return;
                }
                for(int i=1; i<=idx-1; i++){
                    temp = temp.next;
                }
                t.next = temp.next;
                temp.next = t;
           }

/// insert element at the starting
           void insertAtStart(int val){
                node temp = new node(val);
                if(head == null){ // empty list
//                   head =tail= temp;
                     insertAtEnd(val);
                }else{
                    temp.next = head;
                    head = temp;
                }
           }

/// insert element at the end
           void insertAtEnd(int val){
               node temp = new node(val);
               if(head == null){
                  head = temp;
               }else{
                 tail.next = temp;
               }
               tail = temp;
           }

/// display the whole linkedlist
           void display(){
               node temp = head;
               while(temp != null){
                    System.out.print(temp.data+" ");
                    temp = temp.next;
               }
           }

/// get the size of the linkedlist
           int size(){
           node temp = head;
           int count = 0;
           while(temp != null){
               count++;
               temp = temp.next;
           }
           return count;
        }
     }

     public static void main(String[] args){
         linkedlist ll = new linkedlist();
         ll.insertAtEnd(1);
         ll.insertAtEnd(2);
         ll.insertAtEnd(3);
         ll.insertAtEnd(4);
         ll.insertAtEnd(5);
         ll.insertAtEnd(6);      // insert at end
         ll.insertAtStart(8);
         ll.insertAtStart(9);   // insert at starting
         ll.insertAt(4,9);
         ll.insertAt(0,4);  // insert at any index
         System.out.println("Element at index: is :"+ll.getElementAt(5));
         ll.deleteAt(3);
         ll.deleteAt(0);
         ll.display();
         System.out.println();
         System.out.println("size: "+ll.size());
     }
}