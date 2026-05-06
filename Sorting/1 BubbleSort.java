/// 22 jan 2026

/*
Do the certain number of passes and every pass,
we compare adjacent element and swap them if they are
not in correct order.
 */

package Sorting;
class BubbleSort {
     public static void main(String[] args){
         int[] arr = Input.Arr();
         Input.print(arr);
         bubbleSort(arr);
         Input.print(arr);
     }
     static void bubbleSort(int[] arr){
          int len = arr.length;
          int temp = 0;
          for(int i=0; i<len-1; i++){
          boolean flag = false;
             for(int j=0; j<len-i-1; j++){
                 if(arr[j] > arr[j+1]){
                    //swap
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;   // visited at least one time
                 }
             }
             if(!flag){
               return;
             }
          }
     }
}
