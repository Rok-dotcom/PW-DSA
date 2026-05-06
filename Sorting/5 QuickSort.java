/// 23 jan 2026

package Sorting;

class QuickSort {
      public static void main(String[] args){
          int[] arr = Input.Arr();
          Input.print(arr);
          quickSort(arr,0,arr.length-1);
          Input.print(arr);
      }
      static void quickSort(int[] arr,int st, int end){
            if(st >= end) return;
            int pi = partition(arr,st,end);
            quickSort(arr,st,pi-1);
            quickSort(arr,pi+1,end);
      }
      static int partition(int[] arr, int st, int end){
            int pivot = arr[st];
            int cnt = 0;

            for(int i=st+1; i<=end; i++){
                if(arr[i] <= pivot) cnt++;
            }

            int pivotIdx = st+cnt;
            swap(arr,st,pivotIdx);

            int i=st, j=end;

            while(i < pivotIdx && j > pivotIdx){
                 while(arr[i] <= pivot && i < pivotIdx) i++;
                 while(arr[j] > pivot && j > pivotIdx) j--;

                 if(i < pivotIdx && j > pivotIdx){
                     swap(arr,i,j);
                     i++;
                     j--;
                 }
            }
            return pivotIdx;
      }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}