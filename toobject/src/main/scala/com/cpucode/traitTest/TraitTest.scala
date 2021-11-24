package com.cpucode.traitTest

/**
 * @author : cpucode
 * @date : 2021/11/24 11:47
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object TraitTest {
  def main(args: Array[String]): Unit = {
    val student: Student13 = new Student13

    student.sayHello()
    println("****************************")


    student.study()
    println("****************************")

    student.dating()
    println("****************************")


    student.play()
  }
}

/**
 * 定义一个父类
 */
class Person13 {
  val name: String = "Person13"
  var age: Int = 20

  def sayHello(): Unit = {
    println("hello from: " + name)
  }

  def increase(): Unit ={
    println("Person13 increase")
  }
}

/**
 * 定义一个特质
 */
trait Young {
  /**
   * 声明抽象
   */
  var age: Int
  /**
   * 非抽象属性
   */
  val name: String = "young"

  /**
   * 声明非抽象的方法
   */
  def play(): Unit ={
    println(s"young people $name is playing")
  }

  /**
   * 声明抽象的方法
   */
  def dating(): Unit
}


class Student13 extends Person13 with Young {
  // 重写冲突的属性
  override val name: String = "Student13"

  // 实现抽象方法
  override def dating(): Unit = println(s"Student13 $name is dating")

  def study(): Unit = println(s"Student13 $name is studying")

  // 重写父类方法
  override def sayHello(): Unit = {
    super.sayHello()
    println(s"hello from: Student13 $name")
  }
}