package com.cpucode.dynamic.bind

/**
 * @author : cpucode
 * @date : 2021/11/23 19:36
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object DynamicBind {
  def main(args: Array[String]): Unit = {
    val student: Person8 = new Student8
    println(student.name)

    student.hello()
  }
}

class Person8 {
  val name: String = "person"
  def hello(): Unit = {
    println("hello person")
  }
}


class Student8 extends Person8 {
  override val name: String = "cpu"

  override def hello(): Unit = {
    println("hello student8")
  }
}

