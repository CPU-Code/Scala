package com.cpucode.highReduce

/**
 * @author : cpucode
 * @date : 2021/11/26 14:21
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object HighReduce {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)

    // 1. reduce
    println(list.reduce(_ + _))
    println(list.reduceLeft(_ + _))
    println(list.reduceRight(_ + _))

    println("*****************")


    val list2 = List(3, 4, 5, 8, 10)
    println(list2.reduce(_ - _))
    println(list2.reduceLeft(_ - _))
    // 3 - (4 - (5 - (8 - 10)))
    println(list2.reduceRight(_ - _))

    println("*****************")

    // 2. fold
    // 10 + 1 + 2 + 3 + 4
    println(list.fold(10)(_ + _))
    // 10 - 1 - 2 - 3 - 4
    println(list.foldLeft(10)(_ - _))

    // 3 - (4 - (5 - (8 - (10 - 11)))),  -5
    println(list2.foldRight(11)(_ - _))
  }
}
