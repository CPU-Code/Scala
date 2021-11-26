package com.cpucode.parallelTest

import scala.collection.immutable
import scala.collection.parallel.ParSeq

/**
 * @author : cpucode
 * @date : 2021/11/26 15:58
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object ParallelTest {
  def main(args: Array[String]): Unit = {
    val result: immutable.IndexedSeq[Long] = (1 to 100).map(
      x => Thread.currentThread.getId
    )
    println(result)
    println("***********************")


    val result2: ParSeq[Long] = (1 to 100).par.map(
      x => Thread.currentThread.getId
    )
    println(result2)
  }
}
