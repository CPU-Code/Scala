package com.cpucode.objectTest

/**
 * @author : cpucode
 * @date : 2021/11/24 11:17
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object ObjectTest {
  def main(args: Array[String]): Unit = {
    val student11 = Student11.newStudent("cpuCode", 22)
    student11.printInfo()
    println("*******************************")


    val student12 = Student11.apply("cpu", 11)
    student12.printInfo()
    println("*******************************")


    val student13 = Student11("code", 33)
    student13.printInfo()
  }
}

class Student11 private(val name: String, val age: Int){
  def printInfo(): Unit ={
    println(s"student: name = ${name}, age = $age, school = ${Student11.school}")
  }
}

object Student11 {
  val school: String = "MM"

  def newStudent(name: String, age: Int): Student11 = new Student11(name, age)

  def apply(name: String, age: Int): Student11 = new Student11(name, age)
}
