/// 24 jan 2026

package Collections;

import java.util.*;

public class ListInterfaceExamples {

    ///  ArrayList
    static void arrayList(){
    ArrayList<Integer> arr = new ArrayList<>();

    arr.add(1);
    arr.add(2);
    arr.add(3);
    arr.set(1,20); // add at index

    System.out.println(arr.get(2)); // 3
    System.out.println(arr.contains(3)); // true
    System.out.println(arr); //[1,2,3]

    }

    ///  LinkedList
    static void LinkedListExample(){
        LinkedList<Integer> arr = new LinkedList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.set(1,20); // add at index

        System.out.println(arr.get(2)); // 3
        System.out.println(arr.contains(3)); // true
        System.out.println(arr); //[1,2,3]
    }
    ///  Stack
    static void stackExamples(){
        Stack<String> st = new Stack<>();
        st.push("Hello");
        st.push("world");
        st.push("today");
        st.pop();           // removes last item

        System.out.println(st);      // prints all
        System.out.println(st.peek());  // reads last element
        System.out.println(st.empty()); // tell true or false
        System.out.println(st.size());  // size of the stack

    }
    public static void main(String[] args){
       arrayList();
       LinkedListExample();
       stackExamples();
    }
}
