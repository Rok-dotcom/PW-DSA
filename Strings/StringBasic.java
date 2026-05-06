// page-1
// 4 jan 2026 Sunday Revise day-1
// All string with PW

             /// Commands or inbuilt library function ///
/*
    String str = "Ramesh Koli";

    1)str.length();              --> for finding length of string
    2)str.charAt(0);              --> 0th index char of the string
    3)str.indexOf('a')           --> tells index of the letter.
    4)str.contains("a")          --> tells is string contains a or not by 0.
    5)str.compareTo(gtr)         --> compares one string to the another string.
    6)str.next();                --> for taking input as a first word of the string .
    7)str.nextLine();            --> for taking input total string.
    8)str.startsWith("Ram");     --> it is start with this or not.
    9)str.endsWith("esh");       --> it is ends with this or not.
   10)str.toLowerCase();         --> converting into lowercase.
   11)str.toUpperCase();         --> converting into UpperCase.
   12)str.concat(str2);          -->  for adding to strings.
   13)str.substring(i);          --> for printing subset of the string i.e. from i to end . i:included
   13)str.substring(i,j);        --> for printing subset of the string in range 0-2 = 0:included , 2:excluded = i.e. 0,1
   14)str.equals() and ==        --> use only for string.
   -------StringBuilder--------
   15)str.setCharAt(index,'a');  --> if you want to add char in string
   16)str.insert(idx,ch);        --> it inserts the ch not deleting.
   17)str.deleteCharAt(ch);      --> it deletes the index element.
   18)str.reverse();             --> it reverse the string.
   19)str.toCharArray();         --> works as for each loop. iterate from each char of the string.
   20)str.toString();            --> return complete array.
   --------extra-------
   21)Character.isDigit(ch);     --> true if it is number.
   22)Integer.parseInt(ch);      --> string to integer.
 */

package Strings;

public class StringBasic {

    public static void main(String[] args){
        String str = "physics";

        for(int i=2; i<4; i++){
            System.out.print(str.substring(i));
        }
    }


}
