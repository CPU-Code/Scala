package com.cpucode.lazyTest

/**
 * @author : cpucode
 * @date : 2021/11/23 13:46
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object LazyTest {
  def main(args: Array[String]): Unit = {
    lazy val result: Int = sum(10, 20)

    println("被调用了")

    println("****************************")
    println("result: " + result)

    println("****************************")
    println("result: " + result)
  }

  def sum(a: Int, b: Int): Int = {
    println("sum 调用")
    a + b
  }
}
