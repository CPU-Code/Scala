package com.cpucode.logic

/**
 * @author : cpucode
 * @date : 2021/11/22 13:31
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object Logic {
  def main(args: Array[String]): Unit = {
    //逻辑运算符
    def m(n: Int): Int = {
      println("m 被调用")
      return n
    }

    val n = 1

    println((4 > 5) && m(n) > 0)

    def isNotEmpty(str: String): Boolean = {
      return str != null && ("").equals(str.trim)
    }

    println(isNotEmpty(null))
  }
}
