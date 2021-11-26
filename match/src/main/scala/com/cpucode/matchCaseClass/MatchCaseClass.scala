package com.cpucode.matchCaseClass

/**
 * @author : cpucode
 * @date : 2021/11/26 20:32
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
class MatchCaseClass {
  def main(args: Array[String]): Unit = {
    val student = Student1("cpuCode", 20)

    // 针对对象实例的内容进行匹配
    val result = student match {
      case Student1("cpuCode", 30) => "cpuCode, 30"
      case _ => "Else"
    }
  }
}

case class Student1(name: String, age: Int)
