package OOPs;
import java.util.*;

 class ArrayList {


    public static class Arraylist{

        int[] arr = new int[4];
        int idx = 0;
        int size = 0;

        public void add(int ele){
            if(size == arr.length){
                int[] brr = Arrays.copyOf(arr,arr.length*2);
                arr = brr;
//                arr = new int[brr.length];
//                arr = Arrays.copyOf(brr,brr.length);
            }
            arr[idx] = ele;
            idx++;
            size++;
        }
        public void set(int idx,int ele){
            arr[idx] = ele;
        }
    }

    public static void main(String[] args){
        Arraylist arr = new Arraylist();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println(arr.size);
        arr.set(0,10);
    }
}
