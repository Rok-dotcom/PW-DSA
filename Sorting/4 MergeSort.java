/// 23 jan 2026

package Sorting;

class MergeSort {
        public static void main(String[] args){
            int[] arr = Input.Arr();
            Input.print(arr);
            mergeSort(arr,0,arr.length-1);
            Input.print(arr);
        }
        static void mergeSort(int[] arr,int start, int end){
              if(start >= end) return;
              int mid = (start+end)/2;
              mergeSort(arr,start,mid);
              mergeSort(arr,mid+1,end);
              merge(arr,start,mid,end);
        }
        static void merge(int[] arr,int start,int mid,int end){
              int n1 = mid-start+1;
              int n2 = end-mid;
              int[] left = new int[n1];
              int[] right = new int[n2];

              for(int i=0; i<n1; i++) left[i] = arr[start+i];
              for(int j=0; j<n2; j++) right[j] = arr[mid+1+j];

              int i=0;
              int j=0;
              int k=start;
              while(i<n1 && j<n2){
                   if(left[i] < right[j]){
                      arr[k] = left[i];
                      i++;
                   }else{
                        arr[k] = right[j];
                        j++;
                   }
                  k++;
              }
              while(i<n1){
                   arr[k++] = left[i++];
              }
              while(j<n2){
                   arr[k++] = right[j++];
              }
        }
}