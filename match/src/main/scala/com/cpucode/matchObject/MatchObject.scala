package com.cpucode.matchObject

/**
 * @author : cpucode
 * @date : 2021/11/26 20:27
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object MatchObject {
  def main(args: Array[String]): Unit = {
    val student = new Student("cpuCode", 20)

    // 针对对象实例的内容进行匹配
    val result = student match {
      case Student("cpuCode", 20) => "cpuCode , 20"
      case _ => "Else"
    }

    println(result)
  }
}

/**
 * 定义类
 * @param name
 * @param age
 */
class Student(val name: String, val age: Int)

object Student {
  def apply(name: String, age: Int): Student = new Student(name, age)

  def unapply(student: Student): Option[(String, Int)] = {
    if (student == null) {
      None
    } else {
      Some((student.name, student.age))
    }
  }
}

