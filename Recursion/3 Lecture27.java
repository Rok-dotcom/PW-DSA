package Recursion;

class Lecture27 {
    public static void main(String[] args){
        int n =5;
        System.out.print("sum is : "+sum(n));
    }
    static int sum(int n){
        // last point
        if(n==1){
            return 1;
        }

        // my work + splitting the work
        return n+sum(n-1);
    }
}

