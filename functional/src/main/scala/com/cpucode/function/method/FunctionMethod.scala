package com.cpucode.function.method

/**
 * @author : cpucode
 * @date : 2021/11/22 15:10
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object FunctionMethod {
  def main(args: Array[String]): Unit = {
    // 定义函数
    def hiCpu(name: String): Unit = {
      println("hi" + name)
    }

    // 调用函数
    hiCpu("cpu")

    // 调用对象方法
    FunctionMethod.hiCpu("cpu")

    // 获取方法返回值
    val result = FunctionMethod.sayHello("cpuCode")
    println(result)
  }

  /**
   * 定义对象的方法
   * @param name
   */
  def hiCpu(name: String): Unit = {
    println("Hi, " + name)
  }

  def sayHello(name: String): String = {
    println("Hello, " + name)

    return "Hello"
  }
}
