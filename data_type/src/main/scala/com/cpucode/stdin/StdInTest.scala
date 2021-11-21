package com.cpucode.stdin

import scala.io.StdIn

/**
 * @author : cpucode
 * @date : 2021/11/21 21:12
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object StdInTest {
  def main(args: Array[String]): Unit = {
    // 输入信息
    println("请输入您的大名：")
    val name: String = StdIn.readLine()

    println("请输入您的芳龄：")
    val age: Int = StdIn.readInt()

    // 控制台打印输出
    println(s"欢迎${age}岁的${name}来到这")
  }

}
