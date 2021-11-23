package com.cpucode.closure.currying

/**
 * @author : cpucode
 * @date : 2021/11/23 11:46
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object ClosureCurrying {
  def main(args: Array[String]): Unit = {
    def add(a: Int, b: Int): Int = {
      a + b
    }

    // 考虑固定一个加数的场景
    def addByFour(b: Int): Int = {
      4 + b
    }

    //  扩展固定加数改变的情况
    def addByFive(b: Int): Int = {
      5 + b
    }

    // 将固定加数作为另一个参数传入，但是是作为”第一层参数“传入
    def addByFour1(): Int => Int = {
      val a = 4
      def addB(b: Int): Int = {
        a + b
      }
      addB
    }

    def addByA(a: Int): Int => Int = {
      def addB(b: Int): Int = {
        a + b
      }
      addB
    }

    println(addByA(10)(20))
    println("*******************************************")


    val addByFour2 = addByA(10)
    val addByFive2 = addByA(20)

    println(addByFour2(30))
    println(addByFive2(40))
    println("*******************************************")


    // lambda表达式简写
    def addByA1(a: Int): Int => Int = {
      (b: Int) => {
        a + b
      }
    }

    def addByA2(a: Int): Int => Int = {
      b => a + b
    }

    def addByA3(a: Int): Int => Int = a + _

    val addByFour3 = addByA3(10)
    val addByFive3 = addByA3(20)
    println(addByFour3(30))
    println(addByFive3(40))
    println("*******************************************")


    // 柯里化
    def addCurrying(a: Int)(b: Int): Int = {
      a + b
    }

    println(addCurrying(10)(20))
  }


}
