package com.cpucode.abstractClass

/**
 * @author : cpucode
 * @date : 2021/11/23 19:40
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object AbstractClass {
  def main(args: Array[String]): Unit = {
    val student = new Student9
    student.eat()
    println("********************")

    student.sleep()
  }
}

/**
 * 定义抽象类
 */
abstract class Person9 {
  /**
   * 非抽象属性
   */
  var name: String = "cpu"

  /**
   * 抽象属性
   */
  var age: Int

  /**
   * 非抽象方法
   */
  def eat(): Unit = {
    println("Person9 eat")
  }

  /**
   * 抽象方法
   */
  def sleep(): Unit
}

/**
 * 定义具体的实现子类
 */
class Student9 extends Person9 {
  /**
   * 实现抽象属性和方法
   */
  var age: Int = 18

  def sleep(): Unit = {
    println("Student9 sleep")
  }

  // 重写非抽象属性和方法
  //  override val name: String = "student"

  name = "student"

  override def eat(): Unit = {
    super.eat()
    println("Student9 eat")
  }
}