package com.cpucode.high.order.function

/**
 * @author : cpucode
 * @date : 2021/11/22 20:40
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object HighOrderFunction {
  def main(args: Array[String]): Unit = {
    def f(n: Int): Int = {
      println("f调用")
      n + 1
    }

    def fun(): Int = {
      println("fun调用")
      1
    }

    val result: Int = f(123)
    println(result)
    println("******************************")

    // 函数作为值进行传递
    val f1: Int => Int = f
    val f2 = f _
    println(f1)
    println(f1(10))

    println(f2)
    println(f2(20))

    println("******************************")

    val f3: () => Int = fun
    val f4 = fun _
    println(f3)
    println(f3())

    println(f4)
    println(f4())
  }
}
