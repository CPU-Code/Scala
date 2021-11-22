package com.cpucode.functionDefine

/**
 * @author : cpucode
 * @date : 2021/11/22 15:18
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object FunctionDefine {
  def main(args: Array[String]): Unit = {
    //函数1：无参，无返回值
    def f1(): Unit = {
      println("1：无参，无返回值")
    }

    println(f1())
    println("======================================")


    //函数2：无参，有返回值
    def f2(): Int = {
      println("2：无参，有返回值")
      return 10
    }

    println(f2())
    println("======================================")


    //函数3：有参，无返回值
    def f3(name: String): Unit = {
      println("3：有参，无返回值 " + name)
    }

    println(f3("cpuCode"))
    println("======================================")


    //函数4：有参，有返回值
    def f4(name: String): String = {
      println("4：有参，有返回值 " + name)
      return "hi, " + name
    }

    println(f4("cpu"))
    println("======================================")


    // 函数5：多参，无返回值
    def f5(name1: String, name2: String): Unit = {
      println("5：多参，无返回值")
      println(s"${name1}和${name2}都是我的好朋友")
    }

    f5("cpu","cpuCode")
    println("======================================")


    //函数6：多参，有返回值
    def f6(a: Int, b: Int): Int = {
      println("6：多参，有返回值")
      return a + b
    }

    println(f6(10, 20))
  }
}
