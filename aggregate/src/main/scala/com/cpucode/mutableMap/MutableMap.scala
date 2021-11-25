package com.cpucode.mutableMap

import scala.collection.mutable

/**
 * @author : cpucode
 * @date : 2021/11/25 14:06
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object MutableMap {
  def main(args: Array[String]): Unit = {
    // 1. 创建map
    val map1: mutable.Map[String, Int] = mutable.Map("a" -> 10, "b" -> 20)
    println(map1)
    println(map1.getClass)
    println("***************************")

    // 2. 添加元素
    map1.put("c", 30)
    map1.put("d", 40)
    println(map1)
    println("***************************")

    map1 += (("e", 50))
    println(map1)
    println("*****************************")

    // 3. 删除元素
    println(map1("c"))
    map1.remove("c")
    println(map1.getOrElse("c", 0))
    println("*****************************")

    map1 -= "d"
    println(map1)
    println("*****************************")


    // 4. 修改元素
    map1.update("a", 1)
    map1.update("b", 10)
    println(map1)
    println("*************************************")

    // 5. 合并两个Map
    val map2: Map[String, Int] = Map("aaa" -> 10, "bb" -> 20, "cc" -> 30)
    println(map2)
    println("****************************")

    val map3: Map[String, Int] = map2 ++ map1

    println(map1)
    println(map2)
    println(map3)
  }
}
