package com.cpucode.immutableMap

/**
 * @author : cpucode
 * @date : 2021/11/25 13:59
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object ImmutableMap {
  def main(args: Array[String]): Unit = {
    // 1. 创建map
    val map1: Map[String, Int] = Map("a" -> 10, "b" -> 20, "c" -> 30)
    println(map1)
    println(map1.getClass)
    println("*********************")

    // 2. 遍历元素
    map1.foreach(println)
    map1.foreach((kv: (String, Int)) => println(kv))
    println("*************************")


    // 3. 取map中所有的key 或者 value
    for (key <- map1.keys){
      println(s"$key --> ${map1.get(key)}")
    }
    println("*************************")

    // 4. 访问某一个key的value
    println("a: " + map1.get("a").get)
    println("c: " + map1.get("c"))
    println("c: " + map1.getOrElse("c", 0))
    println("s: " + map1.getOrElse("s", 0))
    println("*************************")

    println(map1("a"))
  }
}
