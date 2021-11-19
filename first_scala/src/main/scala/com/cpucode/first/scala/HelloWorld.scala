package com.cpucode.first.scala

/**
 * object: 关键字，声明一个单例对象（伴生对象）
 *
 * @author : cpucode
 * @date : 2021/11/19 21:26
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object HelloWorld {
  /**
   * main 方法：从外部可以直接调用执行的方法
   * def 方法名称(参数名称: 参数类型): 返回值类型 = { 方法体 }
   * @param args
   */
  def main(args: Array[String]): Unit = {
    println("hello cpucode")

    System.out.println("hello scala from java")
  }
}
