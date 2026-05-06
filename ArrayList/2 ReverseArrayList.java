package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

class ReverseArrayList {

    // reverse given array
//    static ArrayList<Integer> reverse(Array<Integer> ){
//
//        int left = 0;
//        int right = arr.length - 1;
//        int temp = 0;
//        while(left < right){
//            temp = arr.get(left);      // .set(index) .add(element) .
//        }
//        return arr;
//    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();


//        int[] arr = new int[5];
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the Array: ");
        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }


        int left = 0;
        int right = arr.size()-1;
        int temp1 = 0;
        while(left < right){
            temp1 = arr.get(left);      // .set(index) .add(element) .get(index)
            arr.set(left,arr.get(right));
            arr.set(right,temp1);
            left++;
            right--;
        }

        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
