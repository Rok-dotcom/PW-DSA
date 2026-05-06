package Collections;

import java.util.*;
public class QueueInterfaceExamples {


      static void ArrayDequeueExample(){
          Deque<Integer> dq = new ArrayDeque<>();
          dq.addFirst(1);
          dq.addLast(2);
          dq.addFirst(3);
          dq.addLast(4);
          System.out.println(dq);

          System.out.println(dq.pollLast());
          System.out.println(dq.pollLast());
      }


       /// LinkedList Queue
      static void LinkedListExample (){
      LinkedList<Integer> q = new LinkedList<>();

          q.offer(1);
          q.offer(2);
          q.offer(3);

          System.out.println(q.peek());
          System.out.println(q.size());
          System.out.println(q.isEmpty());
          System.out.println(q);
          q.poll();
          System.out.println(q);
      }



      static void priorityQueueExamples(){
//          PriorityQueue<Integer> pq = new PriorityQueue<>(); // min queue
          PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // max queue

          pq.add(1);
          pq.add(2);
          pq.add(3);

          System.out.println(pq.peek());
          System.out.println(pq);
          System.out.println(pq.poll());
      }
      public static void main(String[] args){
        LinkedListExample();
        priorityQueueExamples();
        ArrayDequeueExample();
      }
}
