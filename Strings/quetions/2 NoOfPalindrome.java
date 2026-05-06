// page-5
package Strings.quetions;

class NoOfPalindrome {
    public static void main(String[] args){
        String str = "abbd";
        int count =0;
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length()+1; j++){
                String s = str.substring(i,j);
                // isPalindrome method
                if(isPalindrome(s)){
                System.out.print(str.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println(count);
    }

    static boolean isPalindrome(String str){

        int start = 0;
        int end = str.length()-1;
        while(start < end){
            char chFront = str.charAt(start);
            char chRear = str.charAt(end);
            if(chFront != chRear){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}