// page -6
package Strings.quetions;

class ReverseWord {
    public static void main(String[] args){
        String str = "I am an educator";
        StringBuilder sb = new StringBuilder("");
        String ans = "";

        System.out.print(sb.reverse());      //rotacude na ma I
            // adding into string until space.
            // if space get occur append that in reverse.
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                sb.append(ch);
            }else{
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder("");
            }
        }
         sb.reverse();
         ans += sb;
         System.out.print(ans);
    }
}
