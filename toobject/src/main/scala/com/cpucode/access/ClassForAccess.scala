package com.cpucode.access

/**
 * @author : cpucode
 * @date : 2021/11/23 16:04
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object ClassForAccess {

}

/**
 * 定义一个父类
 */
class Person {
  private var idCard: String = "12345"
  protected var name: String = "cpu"

  var sex: String = "female"

  private[access] var age: Int = 20

  def printInfo(): Unit = {
    println(s"Person: $idCard $name $sex $age")
  }
}


