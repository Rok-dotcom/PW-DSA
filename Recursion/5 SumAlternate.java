package Recursion;// 2 jan 2026


class SumAlternate {

    static int sum(int n) {
        // make alternate number addition up to given number
        // make alternate number subtraction up to given number




        // self work and split work
        // self work addition and subtraction
        // n - sum(n-1)
        // return sum(n-1)- sum(n-2);

        // if(n%2==0){
//              sub -= n;
//    }
        if (n == 0) {
            return 0;
        }

        if(n%2 == 0) { // even
            return sum(n - 1) - n;
        }else{ // odd
            return sum(n-1) +n;
        }
    }

    public static void main(String[] args){
        System.out.print(sum(15));
    }
}