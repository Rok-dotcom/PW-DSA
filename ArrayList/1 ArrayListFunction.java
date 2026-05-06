///  11 jan 2026


package ArrayList;

import java.util.ArrayList;

class ArrayListFunction {

    public static void main(String[] args){

        // ArrayList is helpful when we don't have the array size

        ArrayList arr = new ArrayList<>();
        // here Integer is wrapper class
        // if we not give and datatype it will accept all data types by default.

        arr.add(1);       // Integer
        arr.add(2.5);     // Double
        arr.add(1.2);     // float
        arr.add(true);    // boolean
        arr.add("Ramesh");// String

        System.out.println(arr);

    }
}
