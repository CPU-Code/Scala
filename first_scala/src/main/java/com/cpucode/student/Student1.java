package com.cpucode.student;

/**
 * @author : cpucode
 * @date : 2021/11/21 15:56
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Student1 {
    private String name;
    private Integer age;
    private static String school = "cpuCode";

    public Student1(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(this.name + " " + this.age + " " + Student1.school);
    }

    public static void main(String[] args) {
        Student1 cpu = new Student1("cpu", 22);
        Student1 code = new Student1("code", 25);

        cpu.printInfo();
        code.printInfo();
    }
}
