/// 6 feb 2026

package BinarySearch;

/*
Find the first occurrence of a given element x, given that the
given array is sorted. If no occurrence of x is found then return
-1.

Input
arr = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
x=5
Output : 1
 */ // Problem statement

import java.util.*;
class FirstOcc {

    static int firstOcc(int[] arr,int target){
    int fo = -1;
    int st = 0;
    int end = arr.length-1;
    while(st <= end){
        int mid = st+((end - st)/2);
        if(arr[mid] == target){
            fo = mid;
            end = mid-1;
        }else if(target < arr[mid]){
            end = mid-1;
        }else {
            st = mid+1;
        }
    }
        return fo;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(firstOcc(arr,9));
    }
}
