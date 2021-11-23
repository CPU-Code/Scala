package com.cpucode.practice

/**
 * @author : cpucode
 * @date : 2021/11/23 10:26
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object Practice {
  def main(args: Array[String]): Unit = {
    /**
     * 定义一个匿名函数，并将它作为值赋给变量 fun。
     * 函数有三个参数，类型分别为 Int， String， Char，返回值类型为 Boolean。
     * 要求 :
     *  调用函数 fun(0, “”, ‘0’) 得到返回值为 false，其它情况均返回 true
     */
    var fun = (i: Int, s: String, c: Char) => {
      if (i == 0 && s == "" && c == '0') false else true
    }

    println(fun(0, "", '0'))
    println(fun(0, "", '1'))
    println(fun(10, "", '0'))
    println(fun(0, "cpu", '0'))
    println("********************************")

    /**
     * 定义一个函数 func，它接收一个 Int 类型的参数，返回一个函数（记作 f1）
     * 它返回的函数 f1，接收一个 String 类型的参数，同样返回一个函数（记作 f2）
     * 函数 f2 接收一个 Char 类型的参数，返回一个 Boolean 的值
     * 要求 : 调用函数 func(0) (“”) (‘0’) 得到返回值为 false ，其它情况均返回 true
     */
    def func(i: Int): String => (Char => Boolean) = {
      def f1(s: String): Char => Boolean = {
        def f2(c: Char): Boolean = {
          if (i == 0 && s == "" && c == '0') false else true
        }
        f2
      }
      f1
    }

    println(func(0)("")('0'))
    println(func(0)("")('1'))
    println(func(10)("")('0'))
    println(func(0)("cpuCode")('0'))
    println("********************************")


    // 匿名函数简写
    def func1(i: Int): String => (Char => Boolean) = {
      s => c => if (i == 0 && s == "" && c == '0') false else true
    }

    println(func1(0)("")('0'))
    println(func1(0)("")('1'))
    println(func1(10)("")('0'))
    println(func1(0)("cpuCode")('0'))
    println("********************************")


    // 柯里化
    def func2(i: Int)(s: String)(c: Char): Boolean = {
      if (i == 0 && s == "" && c == '0') false else true
    }

    println(func2(0)("")('0'))
    println(func2(0)("")('1'))
    println(func2(10)("")('0'))
    println(func2(0)("cpuCode")('0'))
    println("********************************")
  }
}
