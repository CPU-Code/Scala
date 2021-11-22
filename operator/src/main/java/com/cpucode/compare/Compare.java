package com.cpucode.compare;

/**
 * @author : cpucode
 * @date : 2021/11/22 13:04
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Compare {
    public static void main(String[] args) {
        // 比较运算符
        String s1 = "cpuCode";
        String s2 = new String("cpuCode");

        Boolean isEqual = s1 == s2;
        System.out.println(isEqual);

        System.out.println(s1.equals(s2));
    }
}
