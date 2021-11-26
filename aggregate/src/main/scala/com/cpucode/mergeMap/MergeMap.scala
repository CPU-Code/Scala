package com.cpucode.mergeMap

import scala.collection.mutable

/**
 * @author : cpucode
 * @date : 2021/11/26 14:25
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object MergeMap {
  def main(args: Array[String]): Unit = {
    // 两个 Map 的数据合并
    val map1 = Map("a" -> 1, "b" -> 2, "b" -> 3)
    val map2 = mutable.Map("a" -> 4, "b" -> 5, "d" -> 6)

    println(map1 ++ map2)
    println("****************")

    val map3 = map1.foldLeft(map2)(
      (mergedMap, kv) => {
        val key = kv._1
        val value = kv._2
        mergedMap(key) = mergedMap.getOrElse(key, 0) + value

        mergedMap
      }
    )

    println(map3)
  }
}
