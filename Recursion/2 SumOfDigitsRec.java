package Recursion;// 1 jan 2026

 class SumOfDigitsRec {

    static int sumOfIntDigits(int n){

        if(n < 10) return n;
        return n %10 + sumOfIntDigits(n/10);
    }

    public static void main(String[] args){
        int n = 12345;
        System.out.print(sumOfIntDigits(n));
    }
}
