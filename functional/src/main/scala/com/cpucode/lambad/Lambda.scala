package com.cpucode.lambad

/**
 * @author : cpucode
 * @date : 2021/11/22 17:13
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object Lambda {
  def main(args: Array[String]): Unit = {
    val fun = (name: String) => {
      println(name)
    }

    fun("cpuCode")
    println("========================")


    // 定义一个函数，以函数作为参数输入
    def f(func: String => Unit): Unit = {
      func("cpu")
    }

    f(fun)
    f((name: String) => {
      println(name)
    })
    println("========================")


    // 匿名函数的简化原则
    //参数的类型可以省略，会根据形参进行自动的推导
    f((name) => {
      println(name)
    })
    println("=========================")

    // 类型省略之后，发现只有一个参数，则圆括号可以省略；
    // 其他情况：没有参数和参数超过1的永远不能省略圆括号
    f( name => {
      println(name)
    })
    println("=========================")


    // 匿名函数如果只有一行，则大括号也可以省略
    f(name => println(name))
    println("=========================")


    //如果参数只出现一次，则参数省略且后面参数可以用_代替
    f(println(_))
    println("=========================")


    //如果可以推断出，当前传入的println是一个函数体，而不是调用语句，可以直接省略下划线
    f(println)
    println("=========================")

  }
}
