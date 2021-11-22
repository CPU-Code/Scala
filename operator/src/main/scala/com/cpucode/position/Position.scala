package com.cpucode.position

/**
 * @author : cpucode
 * @date : 2021/11/22 14:26
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object Position {
  def main(args: Array[String]): Unit = {
    // 位运算符
    // 0011 1100
    val a: Byte = 60

    // 1111 0000
    println(a << 2)
    // 0000 1111
    println(a >> 2)

    // 1000 1101
    val b: Short = -13

    // 1011 0100
    println(b << 2)
    // 1000 0011
    println(b >> 2)
    //1000 0000 0000 0000 0000 0000 0000 1101
    //1111 1111 1111 1111 1111 1111 1111 0011
    //0011 1111 1111 1111 1111 1111 1111 1100
    println(b >>> 2)
  }
}
