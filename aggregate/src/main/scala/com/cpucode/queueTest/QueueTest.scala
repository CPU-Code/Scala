package com.cpucode.queueTest

import scala.collection.immutable.Queue
import scala.collection.mutable

/**
 * @author : cpucode
 * @date : 2021/11/26 15:54
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object QueueTest {
  def main(args: Array[String]): Unit = {
    val queue: mutable.Queue[String] = new mutable.Queue[String]()

    // 添加元素
    queue.enqueue("a", "b", "c")
    println(queue)
    println("********************")

    // 获取元素
    println(queue.dequeue())
    println(queue)
    println(queue.dequeue())
    println(queue)
    println("********************")

    queue.enqueue("d", "e")

    println(queue)
    println(queue.dequeue())
    println(queue)


    println("********************")

    // 不可变队列
    val queue2: Queue[String] = Queue("a", "b", "c")
    val queue3 = queue2.enqueue("d")

    println(queue2)
    println(queue3)
  }
}
