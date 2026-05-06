// page-3

package Strings;

// 4 JAN 2026
// timelaps 56:59
public class StringSubstring {

    public static void main(String[] args){
        String str = "abcd"; // 0,1,2,3

        for(int i=0; i<=3; i++){
            for(int j=i+1; j<=4; j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
}
