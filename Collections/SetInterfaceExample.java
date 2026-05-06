/// 24 jan 2026

package Collections;


import java.util.*;
public class SetInterfaceExample {

static void HashSetExample(){
    HashSet<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(4);
    set.add(3);
    set.add(4);
    System.out.println(set);
}
    static void LinkedHashSetExample(){
        HashSet<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(3);
        set.add(4);
        System.out.println(set);
    }
    static void TreeSetExample(){
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(3);
        set.add(4);
        System.out.println(set);
    }
     public static void main(String[] args){
       HashSetExample();
       LinkedHashSetExample();
       TreeSetExample();
     }
}
