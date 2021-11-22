package com.cpucode.fun.funcation

/**
 * @author : cpucode
 * @date : 2021/11/22 21:26
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object FunFunction {
  def main(args: Array[String]): Unit = {
    def f5(): Int => Unit = {
      def f6(a: Int): Unit = {
        println("f6 被调用" + a)
      }
      // 将函数直接返回
      f6
    }

    val f6 = f5()
    println(f6)
    println(f6(10))

    println("*****************************")

    println(f5()(20))
  }
}
