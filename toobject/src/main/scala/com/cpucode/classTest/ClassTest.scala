package com.cpucode.classTest

import scala.beans.BeanProperty

/**
 * @author : cpucode
 * @date : 2021/11/23 15:59
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object ClassTest {
  def main(args: Array[String]): Unit = {
    // 创建一个对象
    val student = new Student()

    //    student.name   // error, 不能访问private属性
    println(student.age)
    println(student.sex)

    student.sex = "female"
    println(student.sex)
  }
}

/**
 * 定义一个类
 */
class Student {
  /**
   * 定义属性
   */
  private var name: String = "cpu"

  @BeanProperty
  var age: Int = _
  var sex: String = _
}

