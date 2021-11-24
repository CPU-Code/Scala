package com.cpucode.mulArray

/**
 * @author : cpucode
 * @date : 2021/11/24 18:06
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object MulArray {
  def main(args: Array[String]): Unit = {
    // 1. 创建二维数组
    val array: Array[Array[Int]] = Array.ofDim[Int](3, 4)

    // 1. 创建二维数组
    array(0)(2) = 10
    array(1)(0) = 20

    println(array.mkString(" , "))
    println("*****************************")


    for (i <- 0 until array.length; j <- 0 until array(i).length) {
      println(array(i)(j))
    }
    println("*****************************")


    for (i <- array.indices; j <- array(i).indices) {
      print(array(i)(j) + "\t")
      if (j == array(i).length - 1) println()
    }
    println("*****************************")


    array.foreach(line => line.foreach(println))
    println("*****************************")


    array.foreach(_.foreach(println))
  }
}
