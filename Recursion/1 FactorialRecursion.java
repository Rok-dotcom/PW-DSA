package Recursion;

class FactorialRecursion {


    static int fact(int n){

        // halting or base condition
        if( n == 2) return 2;

        // self work
        return n*fact(n-1);

    }

    public static void main(String[] args){
        int n = 5;
        System.out.print("factorial is : "+fact(n));
    }
}
