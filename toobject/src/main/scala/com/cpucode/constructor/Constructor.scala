package com.cpucode.constructor

/**
 * @author : cpucode
 * @date : 2021/11/23 16:16
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object Constructor {
  def main(args: Array[String]): Unit = {
    val student1 = new Student1
    student1.Student1()
    println("*************************")

    val student2 = new Student1("cpu")
    println("*************************")

    val student3 = new Student1("cpuCode", 25)
  }
}

/**
 * 定义一个类
 */
class Student1() {
  // 定义属性
  var name: String = _
  var age: Int = _

  println("1. 主构造方法被调用")

  // 声明辅助构造方法
  def this(name: String){
    // 直接调用主构造器
    this()

    println("2. 辅助构造方法一被调用")

    this.name = name
    println(s"name: $name age: $age")
  }

  def this(name: String, age: Int){
    this(name)
    println("3. 辅助构造方法二被调用")

    this.age = age
    println(s"name: $name age: $age")
  }

  def Student1(): Unit = {
    println("一般方法被调用")
  }
}

