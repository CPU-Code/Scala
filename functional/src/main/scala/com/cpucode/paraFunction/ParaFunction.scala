package com.cpucode.paraFunction

/**
 * @author : cpucode
 * @date : 2021/11/22 21:10
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object ParaFunction {
  def main(args: Array[String]): Unit = {
    // 2. 函数作为参数进行传递
    // 定义二元计算函数
    def dualEval(op: (Int, Int) => Int, a: Int, b: Int): Int = {
      op(a, b)
    }

    def add(a: Int, b: Int): Int = {
      a + b
    }

    println(dualEval(add, 10 , 20))
    println(dualEval((a, b) => a + b, 10 , 20))
    println(dualEval((_ + _), 10, 20))

  }
}
