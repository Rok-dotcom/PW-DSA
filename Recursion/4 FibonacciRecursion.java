package Recursion;

class FibonacciRecursion {

    static int fibo(int n){

//        take 2;
        if(n == 0 || n == 1){
            return n;
        };
        return fibo(n-1)+fibo(n-2);


//         base condition take 1
//        if(n == 0){
//            System.out.print(0+" ");
//            return ;
//        }
//
////        int previousNum = 1;
////        int previousToPNum = 0;
//
//        int presentNum = fibo(n-1) + fibo(n-2);
//        System.out.print(presentNum+" ");

    }



    public static void main(String[] args){
        int n = 10;
//        fibo(n);
        for(int i = 0; i<=n; i++){
            System.out.print(fibo(i)+" ");
        }
    }
}
