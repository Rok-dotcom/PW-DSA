package Sorting;

import java.util.*;
public class Input {

public static void main(String[] args){




}
    public static int[] Arr(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the elements of the Array: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static void print(int[] arr){
    System.out.println();
      for(int n: arr){
         System.out.print(n+" ");
      }
    }
}
