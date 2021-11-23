package com.cpucode.annoymousClass

/**
 * @author : cpucode
 * @date : 2021/11/23 19:55
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object AnonymousClass {
  def main(args: Array[String]): Unit = {
    val person: Person10 = new Person10 {
      override var name: String = "cpuCode"

      override def eat(): Unit = println("cpu eat() ")
    }

    println(person.name)
    person.eat()
  }
}


/**
 * 定义抽象类
 */
abstract class Person10 {
  var name: String
  def eat(): Unit
}
