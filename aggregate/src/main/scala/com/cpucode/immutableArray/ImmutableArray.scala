package com.cpucode.immutableArray

/**
 * @author : cpucode
 * @date : 2021/11/24 15:18
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object ImmutableArray {
  def main(args: Array[String]): Unit = {
    // 1. 创建数组
    var arr: Array[Int] = new Array[Int](5)

    // 另一种创建方式
    val arr2 = Array(10, 20, 30, 40)
    println(arr)
    println(arr2)
    println("****************************")

    // 2. 访问元素
    println(arr(0))
    println(arr(1))
    println(arr(4))
//   println(arr(5))
    println("****************************")

    arr(0) = 50
    arr(4) = 60
    println(arr(0))
    println(arr(1))
    println(arr(4))
    println("****************************")

    // 3. 数组的遍历
    // 1) 普通for循环
    for (i <- 0 until arr.length){
      println(arr(i))
    }
    println("****************************")

    for (i <- arr.indices) println(arr(i))
    println("****************************")

    // 2) 直接遍历所有元素，增强for循环
    for (elem <- arr2) println(elem)
    println("**************************")

    // 3) 迭代器
    val iter = arr2.iterator
    while (iter.hasNext)
      println(iter.next())
    println("**************************")

    // 4) 调用foreach方法
    arr2.foreach( (elem: Int) => println(elem) )
    arr.foreach( println )

    println(arr2.mkString("--"))
    println("**************************")

    // 添加元素
    val newArr = arr2.:+(22)
    println(arr2.mkString(" , "))
    println(newArr.mkString(" * "))
    println("**************************")


    val newArr2 = newArr.+:(30)
    println(newArr2.mkString(" , "))
    println("**************************")


    val newArr3 = newArr2 :+ 20
    val newArr4 = 20 +: 30 +: newArr3 :+ 40 :+ 50

    println(newArr4.mkString(" , "))

  }
}
