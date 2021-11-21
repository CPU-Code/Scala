package com.cpucode.variable

/**
 * @author : cpucode
 * @date : 2021/11/21 16:50
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object Variable {
  def main(args: Array[String]): Unit = {
    // 声明一个变量的通用语法
    var a: Int = 10

    println(a)

    //声明变量时，类型可以省略，编译器自动推导，即类型推导
    var a1 = 20
    val b1 = 30

    println(a1)
    println(b1)

    //类型确定后，就不能修改，说明Scala是强数据类型语言
    // a2类型为Int
    var a2 = 40
//    a2 = "cpuCode"

    println(a2)

    //变量声明时，必须要有初始值
//    var a3: Int
//    var a3

    //在声明/定义一个变量时，可以使用var或者val来修饰，var修饰的变量可改变，val修饰的变量不可改
    a1 = 50
//    b1 = 60

    println(a1)

    var cpu = new Student("cpu", 10)
    cpu = new Student("cpu1", 20)
    cpu.printInfo()

    cpu = null

    val code = new Student("code", 30)
//    code = new Student("code1", 40)
    code.age = 50

    code.printInfo()
  }

}
