package com.cpucode.variable

/**
 * @author : cpucode
 * @date : 2021/11/21 16:54
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
class Student(name: String, var age: Int) {
  def printInfo(): Unit = {
    println(name + " " + age + " " + Student.school)
  }
}

object Student{
  val school: String = "cpuCode"

}
