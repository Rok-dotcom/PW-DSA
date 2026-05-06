package NumberSystem;

public class BinaryToDecimal {


    //Binary to decimal

    static int convertIntoDecimal(int n){

        int sum = 1;
        int ld = 0;
        int ans = 0;
        while(n>0){
            ld = n%10;
            ans+=sum *ld;
            sum *= 2;
            n/=10;
        }
        return ans;
    }

    public static void main(String[] args){
        int n = 1101;
        System.out.println(convertIntoDecimal(n));

    }
}
