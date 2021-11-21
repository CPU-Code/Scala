package com.cpucode.student;

/**
 * @author : cpucode
 * @date : 2021/11/21 15:56
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
public class Student {
    private String name;
    private Integer age;
    private static String school = "cpuCode";

    public Student(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(this.name + " " + this.age + " " + Student.school);
    }

    public static void main(String[] args) {
        Student cpu = new Student("cpu", 22);
        Student code = new Student("code", 25);

        cpu.printInfo();
        code.printInfo();
    }
}
