/// 6 feb 2026
/// binary search code

/*
Simple definition:-
  Binary search compares the target element with the middle element
  of a sorted array and eliminates half of the array in each step
  until the element is found or the search space becomes empty.

#Key points to remember:-
  *Works only on sorted data
  *Time complexity: O(log n)
  *Much faster than linear search for large data
  *Uses divide and conquer
  *One-line memory trick

👉 Sorted array + middle element + half elimination = Binary Search
 */

package BinarySearch;

class BinarySearch {

    /// recursively
    static int bs(int[] arr,int st, int end, int target){
        // base case
        if(st > end) return st;
        int mid = (st+end)/2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] < target){
            return bs(arr,mid+1,end,target);
        }else{
            return bs(arr,st,end-1,target);
        }
    }

    /// Iterative
    static int binarySearch(int[] arr,int target){
        int len = arr.length-1;
        int st = 0;
        int end = len;
        while(st <= end){
            int mid = (st+end)/2;
            if(arr[mid] == target){
                return mid;
            }else if(target > arr[mid]){
                st = mid+1;
            }else if (target < arr[mid]){
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int target = 4;
        System.out.println(binarySearch(arr,target));       // for brute force
        System.out.println(bs(arr,0,arr.length-1,target));  // for recursive

    }
}
