package com.cpucode.immutableSet

/**
 * @author : cpucode
 * @date : 2021/11/25 13:44
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object ImmutableSet {
  def main(args: Array[String]): Unit = {
    // 1. 创建set
    val set1 = Set(10, 20, 30, 40, 50, 60)

    println(set1)
    println("**************************")

    // 2. 添加元素
    val set2 = set1 + 70
    println(set1)
    println(set2)
    println("**************************")

    // 3. 合并set
    val set3 = Set(19, 13, 23, 53, 67, 99)
    val set4 = set2 ++ set3
    println(set2)
    println(set3)
    println(set4)
    println("**************************")

    // 4. 删除元素
    val set5 = set3 - 13
    println(set3)
    println(set5)
  }
}
