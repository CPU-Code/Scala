package com.cpucode.singleton

/**
 * @author : cpucode
 * @date : 2021/11/24 11:31
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object Singleton {
  def main(args: Array[String]): Unit = {
    val student1 = Student12.getInstance()
    student1.printInfo()

    val student2 = Student12.getInstance()
    student2.printInfo()
    println("****************************************")

    println(student1)
    println(student2)
  }
}

class Student12 private(val name: String, val age: Int){
  def printInfo(): Unit = {
    println(s"student: name = ${name}, age = $age")
  }
}

/**
 * 懒汉式
 */
object Student12 {
  private var student: Student12 = _

  def getInstance(): Student12 = {
    if (student == null){
      student = new Student12("cpu", 22)
    }
    student
  }

}