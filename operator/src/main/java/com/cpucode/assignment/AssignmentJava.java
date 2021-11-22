package com.cpucode.assignment;

/**
 * @author : cpucode
 * @date : 2021/11/22 14:38
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class AssignmentJava {
    public static void main(String[] args) {
        byte b = 10;
        b = (byte)(b + 1);
        b += 1;

        System.out.println(b);

        int x = 11;
        int y = x++;
        System.out.println("x = " + x + " , y = " + y);

        x = 15;
        y = ++x;
        System.out.println("x = " + x + " , y = " + y);

        x = 22;
        x = x++;
        System.out.println(x);
    }
}
