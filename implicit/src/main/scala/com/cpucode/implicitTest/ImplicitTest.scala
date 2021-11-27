package com.cpucode.implicitTest

/**
 * @author : cpucode
 * @date : 2021/11/27 15:01
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object ImplicitTest {
  def main(args: Array[String]): Unit = {
    val new12 = new MyRichInt(1)
    println(new12.myMax(20))
    println("****************************")


    // 1. 隐式函数
    implicit def convert(num: Int): MyRichInt = new MyRichInt(num)

    println(20.myMax(30))
    println("****************************")


    // 2. 隐式类
    implicit class MyRichInt2(val self: Int) {
      def myMax2(n: Int): Int = if (n < self) self else n
      def myMin2(n: Int): Int = if (n < self) n else self
    }

    println(30.myMin2(40))
    println("****************************")


    // 3. 隐式参数
    implicit val str: String = "cpu"
//    implicit val str2: String = "code"
    implicit val num: Int = 20

    def sayHello()(implicit name: String): Unit = {
      println("hello, " + name)
    }

    def sayHi(implicit name: String = "cpuCode"): Unit ={
      println("hhh " + name)
    }

    sayHello
    sayHi
    println("****************************")

    // 简便写法
    def hiAge(): Unit = {
      println("hi, " + implicitly[Int])
    }

    hiAge
  }
}

/**
 * 自定义类
 * @param self
 */
class MyRichInt(val self: Int) {
  /**
   * 自定义比较大小的方法
   * @param n
   * @return
   */
  def myMax(n: Int): Int = if (n < self) self else n
  def myMin(n: Int): Int = if (n < self) n else self
}
