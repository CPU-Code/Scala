package com.cpucode.matchTypes

/**
 * @author : cpucode
 * @date : 2021/11/26 16:55
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object MatchTypes {
  def main(args: Array[String]): Unit = {
    // 1. 匹配常量
    def describeCount(x: Any): String = x match {
      case 1 => "Int one"
      case "cpu" => "String cpu"
      case true => "Boolean true"
      case '+' => "Char +"
      case _ => "随机值"
    }

    println(describeCount("cpu"))
    println(describeCount('+'))
    println(describeCount(0.5))
    println("*************************")

    // 2. 匹配类型
    def describeType(x: Any): String = x match {
      case i: Int => "Int " + i
      case s: String => "String " + s
      case list: List[String] => "List " + list
      case array: Array[Int] => "Array[Int] " + array.mkString(",")
      case _ => "something else "
    }

    println(describeType(10))
    println(describeType("cpuCode"))
    println(describeType(List("cpu", "code")))
    println(describeType(List(2, 30)))
    println(describeType(Array("Scala", "hello")))
    println(describeType(Array(2, 3)))
    println("*************************")


    //匹配数组
    for (arr <- List(Array(0),
      Array(1, 0),
      Array(0, 1, 0),
      Array(1, 1, 0),
      Array(2, 3, 7, 15),
      Array("hello", 1, 30)
    )) {
      val result = arr match {
        case Array(0) => "0"
        case Array(1, 0) => "Array(1, 0)"
        case Array(x, y) => "Array: " + x + ", " + y  // 匹配两元素数组
        case Array(0, _*) => "以0开头的数组"
        case Array(x, 1, z) => "中间为1的三元素数组"
        case _ => "someThing else"
      }

      println(result)
    }

    println("*******************************")

    // 4. 匹配列表
    // 方式一
    for (list <- List(
      List(0),
      List(1, 0),
      List(0, 0, 0),
      List(1, 1, 0),
      List(88),
      List("hello")
    )) {
      val result = list match{
        case List(0) => "0"
        case List(x, y) => "List(x, y) : " + x + ", " + y
        case List(0, _*) => "List(0, ...)"
        case List(a) => "List(a) : " + a
        case _ => "something else"
      }

      println(result)
    }
    println("*******************************")


    // 方式二
    val list1 = List(1, 2, 3, 4)
    val list = List(30)

    list1 match {
      case first :: second :: rest => println(s"first: $first , second: $second, rest: $rest")
      case _ => println("someThing else")
    }

    println("*******************************")


    // 5. 匹配元组
    for (tuple <- List(
      (0, 1),
      (0, 0),
      (0, 1, 0),
      (0, 1, 1),
      (1, 23, 56),
      ("hello", true, 0.5)
    )) {
      val result = tuple match {
        case (a, b) => "" + a + ", " + b
        case (0, _) => "(0, ...)"
        case (a, 1, _) => "(a, 1, _)" + a
        case (x, y, z) => "(x, y, z) " + x +" " + y + " " + z
        case _ => "something else"
      }

      println(result)
    }


  }
}
