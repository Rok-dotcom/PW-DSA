
/// ----- capital letters
// 65A 66B 67C 68D 69E 70F 71G 72H 73I 74J 75K 76L 77M
// 78N 79O 80P 81Q 82R 83S 84T 85U 86V 87W 88X 89Y 90Z

/// ------ small letters
//97a 98b 99c 100d 101e 102f 103g 104h 105i 106j 107k
//108l 109m 110n 111o 112p 113q 114r 115s 116t 117u 118v
//119w 120x 121y 122z

public class ForAscii {
    public static void main(String[] args){
        for(int i=0; i<=150; i++){
            char asc = (char)i;
            System.out.print(i+""+asc+" ");
        }
    }
}
