///  27 jan 2026
package BitwiseOperators;


// a << b = a * 2^b
// a >> b = a/(2^b)
public class BitwiseOperators {
    public static void main(String[] args){
        int p=9, q=10;

        byte byt = 123;
        System.out.println(byt);

        System.out.println(p|q); // bitwise OR
        System.out.println(p&q); // bitwise AND
        System.out.println(p^q); // bitwise XOR

        System.out.println(p<<1); // left shift
        System.out.println(p>>1); // right shift
    }
}
