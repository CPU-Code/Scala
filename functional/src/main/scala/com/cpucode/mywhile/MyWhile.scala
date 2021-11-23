package com.cpucode.mywhile

/**
 * @author : cpucode
 * @date : 2021/11/23 13:37
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object MyWhile {
  def main(args: Array[String]): Unit = {
    var n = 5

    //常规的while循环
    while (n >= 1){
      println(n)
      n -= 1
    }
    println("***********************")


    // 用闭包实现一个函数，将代码块作为参数传入，递归调用
    def myWhile(condition: => Boolean): (=> Unit) => Unit = {
      // 内层函数需要递归调用，参数就是循环体
      def doLoop(op: => Unit): Unit = {
        if (condition){
          op
          myWhile(condition)(op)
        }
      }
      doLoop _
    }

    n = 5
    myWhile(n >= 1){
      println(n)
      n -= 1
    }

    println("***********************")

    //用匿名函数实现
    def myWhile2(condition: => Boolean): (=> Unit) => Unit = {
      // 内层函数需要递归调用，参数就是循环体
      op => {
        if (condition){
          op
          myWhile2(condition)(op)
        }
      }
    }

    n = 5
    myWhile2(n >= 1){
      println(n)
      n -= 1
    }

    println("***********************")

    // 用柯里化实现
    def myWhile3(condition: => Boolean)(op: => Unit): Unit = {
      if (condition){
        op
        myWhile3(condition)(op)
      }
    }

    n = 5
    myWhile3(n >= 1){
      println(n)
      n -= 1
    }

  }
}
