// page-4

package Strings.quetions;

class ConvertUpperToLower {

    public static void main(String[] args){
        StringBuilder str = new StringBuilder("pHysIcs");
        for( int i = 0; i< str.length(); i++){

            boolean flag = false; // supposing it is capital letter
            char ch = str.charAt(i);
            if(ch == ' ') continue;
            int ascii = (int)ch;
            if(ascii < 91) flag = true;
            if(flag){
                ascii += 32;
                char dh = (char)ascii;
                str.setCharAt(i,dh);
            }else{
                ascii -= 32;
                char dh = (char)ascii;
                str.setCharAt(i,dh);
            }
        }
        System.out.print(str);
    }

}
