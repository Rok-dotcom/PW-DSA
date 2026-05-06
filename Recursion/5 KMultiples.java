package Recursion;//2 jan 2025

class KMultiples {



    static void multiples(int n, int k){

        // base work
        if(k == 1){
            System.out.println(n);
            return;
        }

        // recursive work
        multiples(n,k-1);

        // self work
        System.out.println(n*k);
    }


    public static void main (String[] args){
        multiples(15,10);
//        System.out.println(multiples(15,10));
    }
}
