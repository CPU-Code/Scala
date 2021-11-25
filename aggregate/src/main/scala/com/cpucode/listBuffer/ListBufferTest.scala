package com.cpucode.listBuffer

import scala.collection.mutable.ListBuffer

/**
 * @author : cpucode
 * @date : 2021/11/25 13:35
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object ListBufferTest {
  def main(args: Array[String]): Unit = {
    // 1. 创建可变列表
    val list1: ListBuffer[Int] = new ListBuffer[Int]()
    val list2 = ListBuffer(10, 20, 30)

    println(list1)
    println(list2)
    println("************************")

    // 2. 添加元素
    list1.append(40, 50)
    list2.prepend(60)

    list1.insert(1, 70, 80)
    println(list1)
    println(list2)
    println("************************")

    1 +=: 2 +=: list1 += 4 += 5

    println(list1)
    println("**************************")

    // 3. 合并list
    val list3 = list1 ++ list2
    println(list1)
    println(list2)
    println(list3)
    println("**************************")

    list1 ++=: list2
    println("list1 : " + list1)
    println("list2 : " + list2)
    println("**************************")

    // 4. 修改元素
    list2(5) = 10
    list2.update(0, 90)
    println("list2 : " + list2)
    println("**************************")

    // 5. 删除元素
    list2.remove(2)
    list2 -= 5
    println(list2)

  }
}
