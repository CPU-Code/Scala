package com.cpucode.arith

/**
 * @author : cpucode
 * @date : 2021/11/22 12:51
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object Arith {
  def main(args: Array[String]): Unit = {
    // 1. 算术运算符
    val result1: Int = 10 / 3
    val result2: Double = 10 / 3
    val result3: Double = 10.0 / 3

    println(result1)
    println(result2)
    println(result3)

    val result4: Int = 10 % 3
    println(result4)
  }
}
