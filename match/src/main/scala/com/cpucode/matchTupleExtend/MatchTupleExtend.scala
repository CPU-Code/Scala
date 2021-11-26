package com.cpucode.matchTupleExtend

/**
 * @author : cpucode
 * @date : 2021/11/26 20:19
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object MatchTupleExtend {
  def main(args: Array[String]): Unit = {
    // 1. 在变量声明时匹配
    val (x, y) = (10, "cpuCode")
    println(s"x: $x , y: $y")
    println("*************************")

    val List(first, second, _*) = List(20, 30, 40)
    println(s"first: $first, second: $second")
    println("*************************")


    // 2. for推导式中进行模式匹配
    val list: List[(String, Int)] = List(("a", 10), ("b", 20), ("c", 30), ("a", 40))

    // 2.1 原本的遍历方式
    for (elem <- list){
      println(elem._1 + " " + elem._2)
    }
    println("*************************")


    // 2.2 将List的元素直接定义为元组，对变量赋值
    for ((word, count) <- list){
      println(word + ", " + count)
    }
    println("*************************")


    // 2.3 可以不考虑某个位置的变量，只遍历key或者value
    for((word, _) <- list) {
      println(word)
    }
    println("*************************")

    // 2.4 可以指定某个位置的值必须是多少
    for (("a", count) <- list) {
      println(count)
    }

  }
}
