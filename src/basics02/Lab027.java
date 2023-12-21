package src.basics02;

public class Lab027 {
    public static void main(String[] args) {
        //cast = mold
        //widening is the process of converting lower type to higher type  . This is the safe conversion.


       byte b =  10;
       //int a = b; //Implicit casting - JVM
        int a = (int) b ; //Explicit casting - JVM

        //Narrowing is the process of converting higher type to lower type.
        int a1 = 300;
        //byte b1 = a1; //Implicit casting - JVM
        byte b1 = (byte) a1;

        // 32 Bits
        // 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1
        // will be sotred into the b
        // 0 0 1 0 1 1 0 0
//        0 * 27 + 0 * 26 + 1 * 25 + 0 * 24 + 1 * 23 + 1 * 22 + 0 * 21 + 0 * 20
//        0 + 0 + 32 + 0 + 8 + 4 + 0 + 0
        //44
    }
}
