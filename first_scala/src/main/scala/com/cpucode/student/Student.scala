package com.cpucode.student

/**
 * @author : cpucode
 * @date : 2021/11/21 16:00
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
class Student(name: String, age : Int) {
  def printInfo(): Unit = {
    println(name + " " + age + " " + Student.school)
  }
}

/**
 * 引入伴生对象
 */
object Student {
  val school: String = "cpuCode"

  def main(args: Array[String]): Unit = {
    val cpu = new Student("cpu", 22)
    val code = new Student("code", 25)

    cpu.printInfo()
    code.printInfo()
  }
}
