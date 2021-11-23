package com.cpucode.recursion;

/**
 * @author : cpucode
 * @date : 2021/11/23 12:19
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class RecursionTest {
    public static void main(String[] args) {
        // 计算阶乘
        System.out.println(factorial(5));
        System.out.println(fact(5));
    }

    // 循环实现
    public static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }

        return result;
    }

    //递归实现
    public static int fact(int n){
        // 基准情形 0! = 1
        if (n == 0) return 1;
        return fact(n - 1) * n;
    }
}
