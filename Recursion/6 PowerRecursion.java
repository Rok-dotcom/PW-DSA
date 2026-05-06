package Recursion;

class PowerRecursion {


    static int power(int n,int p){ // 2,4

        // base case
        if(p == 1){
            return n;
        }

        // n*power(p-1) = 2*3,2*2, 2*1

        // self work and split work
        return n*power(n,p-1);
    }


    public static void main(String[] args){

        System.out.print(power(2,4));
    }
}
