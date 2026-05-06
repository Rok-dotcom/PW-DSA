// page-2

package Strings;

public class Builder {

    public static void main(String[] args){

        StringBuilder str = new StringBuilder("Physics");
        System.out.println(str);


////  ----------String .setCharAt(index, 'ch');
//        str.setCharAt(5,'x');
//        System.out.println(str);

///   ----------String .append("String");
//        str.append(" Walla");
//        str.append(10);
//        System.out.println(str);

///   ----------String .insert(index,'ch'); && .deleteCharAt(0);
//        str.insert(2,"kyu nhi ho rahi padhai");
//        str.deleteCharAt(0);
//        System.out.println(str);

///   --------String .reverse(str);
        str.reverse();
        System.out.println(str);


    }
}