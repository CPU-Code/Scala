package com.cpucode.control.abstraction

/**
 * @author : cpucode
 * @date : 2021/11/23 13:30
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object ControlAbs {
  def main(args: Array[String]): Unit = {
    //传值参数
    def f0(a: Int): Unit = {
      println("a: " + a)
      println("a: " + a)
    }

    f0(10)

    def f1(): Int = {
      println("f1 被调用")
      20
    }

    f0(f1())
    println("******************************")

    //传名参数，传递的不再是具体的值，而是代码块
    def f2(a: => Int): Unit = {
      println("a: " + a)
      println("a: " + a)
    }

    f2(30)
    println("******************************")

    f2(f1())
    println("******************************")

    f2({
      println("这是神奇的操作")
      40
    })
  }
}
