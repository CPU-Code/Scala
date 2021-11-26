package com.cpucode.simpleFunction

/**
 * @author : cpucode
 * @date : 2021/11/26 11:36
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object SimpleFunction {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 4, 3, 5)
    val list2 = List(("a", 6), ("b", 8), ("c", 7), ("d", 9))

    //求和
    var sum = 0
    for (elem <- list){
      sum += elem
    }

    println(sum)
    println(list.sum)
    println("***************************")


    //求乘积
    println(list.product)
    println("***************************")

    // 最大值
    println(list.max)
    println(list2.maxBy((tuple: (String, Int)) => tuple._2))
    println(list2.maxBy(_._2))
    println("***************************")


    //最小值
    println(list.min)
    println(list2.minBy(_._2))
    println("***************************")

    //排序
    val sortedList = list.sorted
    println(sortedList)
    println("***************************")


    // 从大到小逆序排序
    println(list.sorted.reverse)
    println("***************************")

    // 传入隐式参数
    println(list.sorted(Ordering[Int].reverse))
    println(list2.sorted)
    println("***************************")

    // sortBy
    println(list2.sortBy(_._2))
    println(list2.sortBy(_._2)(Ordering[Int].reverse))

    println("***************************")


    // sortWith
    println(list.sortWith( (a: Int, b: Int) => {a < b} ))

    println("***************************")

    println(list.sortWith( _ < _ ))
    println(list.sortWith( _ > _))

  }
}
