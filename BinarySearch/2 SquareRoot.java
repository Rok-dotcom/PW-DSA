/// 6 feb 2026

package BinarySearch;

/*
Find the square root of the given non negative value x. Round it off to the nearest floor integer value.

Input: x=4
Output: 2

Input: x=11
Output: 3
 */

class SquareRoot {
    static int squareRootOf(int n){
    int st = 0;
    int end = n;
    int ans = -1;

    while(st <= end){
        int mid = st+((end-st)/2);
        int val = mid*mid;
        if(val == n){
            return mid;
        }else if(val < n){
            ans = mid;
            st = mid+1;
        }else{
            end = mid-1;
        }
    }
        return ans;
    }
    public static void main(String[] args){
        int num = 144;
        System.out.println(squareRootOf(num));
    }
}
