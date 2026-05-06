package Arrays;
import java.util.Scanner;

class UniqueNum {


    static int uniqueNum(int[] arr){


        int uniq = 0;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,1,2,5,7,4,7,4,};

        System.out.print(uniqueNum(arr));

    }

}
