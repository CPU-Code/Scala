package com.cpucode.anonymous

/**
 * @author : cpucode
 * @date : 2021/11/22 18:54
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object anonymous {
  def main(args: Array[String]): Unit = {
    def dualFunctionOneAndTwo(fun:(Int, Int) => Int): Int = {
      fun(1, 2)
    }

    val add = (a: Int, b: Int) => a + b
    val minus = (a: Int, b: Int) => a - b

    println(dualFunctionOneAndTwo(add))
    println(dualFunctionOneAndTwo(minus))

    println("****************************************")

    // 匿名函数简化
    println(dualFunctionOneAndTwo((a: Int, b: Int) => a + b))
    println(dualFunctionOneAndTwo((a: Int, b: Int) => a - b))

    println("****************************************")

    println(dualFunctionOneAndTwo((a, b) => a + b))
    println(dualFunctionOneAndTwo( _ + _))
    println(dualFunctionOneAndTwo( _ - _))

    println("****************************************")

    println(dualFunctionOneAndTwo((a, b) => b - a))
    println(dualFunctionOneAndTwo( -_ + _))
  }
}
