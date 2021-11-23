package com.cpucode.two.parameter

/**
 * 传递的函数有两个参数
 *
 * @author : cpucode
 * @date : 2021/11/23 10:15
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object TwoParameter {
  def main(args: Array[String]): Unit = {
    def calulator(a: Int, b: Int, op: (Int, Int) => Int): Int = {
      op(a, b)
    }

    // 标准版
    println(calulator(2, 3, (x: Int, y: Int) => {
      x + y
    }))
    println("******************************************")


    // 如果只有一行，则大括号也可以省略
    println(calulator(2, 3, (x: Int, y: Int) => x + y))
    println("******************************************")


    // 参数的类型可以省略，会根据形参进行自动的推导
    println(calulator(2, 3, (x, y) => x + y))
    println("******************************************")


    // 如果参数只出现一次，则参数省略且后面参数可以用_代替
    println(calulator(2, 3, _ + _))
    println("******************************************")
  }
}
