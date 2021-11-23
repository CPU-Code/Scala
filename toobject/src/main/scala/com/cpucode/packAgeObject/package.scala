package com.cpucode

/**
 * @author : cpucode
 * @date : 2021/11/23 15:56
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
package object packAgeObject {
  /**
   * 定义当前包共享的属性和方法
   */
  val commonValue = "cpu"

  def commonMethod() = {
    println(s"我们在 ${commonValue} 引导下学习")
  }
}
