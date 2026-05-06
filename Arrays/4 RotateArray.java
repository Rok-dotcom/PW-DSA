package Arrays;
import java.util.*;

 class RotateArray {

    static void rotateBy(int[] arr,int k){


        int Kcount = k;
        int l = arr.length-1;
        int temp = 0;
        for(int i = 0; i<l; i++){

            if(Kcount > 0){
                temp = arr[l];
                arr[l-i] = arr[l-i-1];
                arr[l-i-1] = arr[l-i-2];
                arr[i] = temp;
                Kcount--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 1;
        System.out.println(Arrays.toString(arr));
        rotateBy(arr,k);
        System.out.println(Arrays.toString(arr));

    }

}
