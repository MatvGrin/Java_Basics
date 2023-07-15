package com.basics.grin;

public class Operators {
    public static void main(String args[]) {
        int a1 = 10;
        int b1 = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b  = " + (a1 + b1));
        System.out.println("a - b  = " + (a1 - b1));
        System.out.println("a * b  = " + (a1 * b1));
        System.out.println("b / a  = " + (b1 / a1));
        System.out.println("b % a  = " + (b1 % a1));
        System.out.println("c % a  = " + (c % a1));
        System.out.println("a++    = " + (a1++));
        System.out.println("a--    = " + (a1--));
        System.out.println("d++    = " + (d++));
        System.out.println("++d    = " + (++d));
        System.out.println("a += b = " + (a1 += b1));
        System.out.println("a      = " + (a1));
        System.out.println("a -= b = " + (a1 -= b1));
        System.out.println("a      = " + (a1));
        int a = 60;
        int b = 13;

        System.out.println("a & b   = " + (a & b)); // 12  = ... 0000 1100
        System.out.println("a | b   = " + (a | b)); // 61  = ... 0011 1101
        System.out.println("a ^ b   = " + (a ^ b)); // 49  = ... 0011 0001
        System.out.println("~a      = " + ~a); // -61 = 1111 1111 1111 1111 1111 1111 1100 0011
        System.out.println("a << 2  = " + (a << 2)); // 240 = ... 1111 0000
        System.out.println("a >> 2  = " + (a >> 2)); // 15  = ... 0000 1111
        System.out.println("a >>> 2 = " + (a >>> 2)); // 15  = ... 0000 1111
        int a2 = 10;
        int b2 = 20;
        System.out.println("a == b = " + (a2 == b2));
        System.out.println("a != b = " + (a2 != b2));
        System.out.println("a > b = " + (a2 > b2));
        System.out.println("a < b = " + (a2 < b2));
        System.out.println("b >= a = " + (b2 >= a2));
        System.out.println("b <= a = " + (b2 <= a2));
        String name = "EPAM";
        boolean result = name instanceof String;
        System.out.println(result);
        int experience = 5;
        int requirements = 10;
        String resul = (experience > requirements) ? "Accept to project" : "Learn more";
        System.out.println(resul);
    }

}
