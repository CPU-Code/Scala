package com.cpucode.exceptionTest

/**
 * @author : cpucode
 * @date : 2021/11/27 14:56
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object ExceptionTest {
  def main(args: Array[String]): Unit = {
    try{
      val n = 10 / 0
    }catch {
      case e: ArithmeticException => {
        println("发生算术异常")
      }
      case e: Exception => {
        println("发生一般异常")
      }
    } finally {
      println("处理结束")
    }


  }
}
