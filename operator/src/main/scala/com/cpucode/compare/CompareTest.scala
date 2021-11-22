package com.cpucode.compare

/**
 * @author : cpucode
 * @date : 2021/11/22 13:12
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object CompareTest {
  def main(args: Array[String]): Unit = {
    // 2. 比较运算符
    val s1: String = "cpuCode"
    val s2: String = new String("cpuCode")

    println(s1 == s2)
    println(s1.equals(s2))

    println(s1.eq(s2))
  }
}
