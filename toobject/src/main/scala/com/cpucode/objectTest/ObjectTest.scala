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

    // 通过伴生对象的 apply 方法，实现不使用 new 关键字创建对象
    val student13 = Student11("code", 33)
    student13.printInfo()
  }
}

/**
 * 伴生对象对应的类称之为伴生类，伴生对象的名称应该和伴生类名一致
 * 主构造器变成私有的，可以在()之前加上 private
 * @param name
 * @param age
 */
class Student11 private(val name: String, val age: Int){
  def printInfo(): Unit ={
    println(s"student: name = ${name}, age = $age, school = ${Student11.school}")
  }
}

/**
 * 伴生对象采用 object 关键字声明
 */
object Student11 {
  val school: String = "MM"

  def newStudent(name: String, age: Int): Student11 = new Student11(name, age)

  def apply(name: String, age: Int): Student11 = new Student11(name, age)
}
