package com.cpucode.data.conversion;

/**
 * @author : cpucode
 * @date : 2021/11/22 10:28
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class TypeConversion {
    public static void main(String[] args) {
        byte b = 10;
        char c = 'a';
        short c2 = (short)c;

        test(b);
        test(c);
        test(c2);
    }

    public static void test(byte b){
        System.out.println("bbb");
    }

//    public static void test(short b){
//        System.out.println("sss");
//    }

    public static void test(char b){
        System.out.println("ccc");
    }

    public static void test(int b){
        System.out.println("iii");
    }

}
