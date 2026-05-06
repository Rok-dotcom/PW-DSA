package Arrays;
// not completed - will complete
class Largest2ndNum {

    static int largest2nd(int[] arr){


        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                second_max = arr[i];
                if(max < second_max){
                    max = second_max;
                }
            }
        }
        return second_max;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,3,2,5,4,2,1};
        System.out.print(largest2nd(arr));
    }
}
