package com.cpucode.commonOp

/**
 * @author : cpucode
 * @date : 2021/11/26 10:47
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object CommonOp {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6)
    val set = Set(10, 20, 30, 40, 50)

    // 获取集合长度
    println(list.length)
    println("**************************")

    //获取集合大小
    println(set.size)
    println("**************************")

    //循环遍历
    for (elem <- list){
      println(elem)
    }
    println("**************************")

    set.foreach(println)
    println("**************************")

    //迭代器
    for (elem <- list.iterator){
      println(elem)
    }
    println("**************************")

    //生成字符串
    println(list)
    println(set)
    println(list.mkString(" , "))
    println("**************************")


    //是否包含
    println(list.contains(23))
    println(set.contains(10))
  }
}
