/// 24 jan 2026

package Collections;

import java.util.*;
public class HashMapInterfaceExample {

      static void HashMapExample(){
//          HashMap<Integer,String> map = new HashMap<>();   // unordered
//          HashMap<Integer,String> map = new LinkedHashMap<>(); // preserve order
          TreeMap<Integer,String> map = new TreeMap<>();   //  sorted

          map.put(1, "Rohan");
          map.put(2, "Rahul");
          map.put(3, "Riya");
          map.put(4, "Rakesh");

          // iteration
          for(var value: map.keySet()){
                System.out.println(value+" ");
          }

          System.out.println(map);
          System.out.println(map.get(1));
          System.out.println(map.containsValue("Rohan"));
          System.out.println(map.containsKey(1));
          System.out.println(map.entrySet());
      }

      public static void main(String[] args){
          HashMapExample();
      }
}
