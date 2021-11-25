package com.cpucode.mutableSet

import scala.collection.mutable

/**
 * @author : cpucode
 * @date : 2021/11/25 13:47
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object MutableSet {
  def main(args: Array[String]): Unit = {
    // 1. 创建set
    val set1: mutable.Set[Int] = mutable.Set(10, 20, 30, 40, 50)
    println(set1)
    println("**********************")

    // 2. 添加元素
    val set2 = set1 + 11
    println(set1)
    println(set2)
    println("**********************")

    set1 += 11
    println(set1)
    println("**********************")

    val flag1 = set1.add(21)
    println(flag1)
    println(set1)
    println("**********************")

    val flag2 = set1.add(21)
    println(flag2)
    println(set1)
    println("**********************")


    // 3. 删除元素
    set1 -= 11
    println(set1)
    println("***************************")

    val flag3 = set1.remove(10)
    println(flag3)
    println(set1)
    println("***************************")

    val flag4 = set1.remove(10)
    println(flag4)
    println(set1)
    println("***************************")
  }
}
