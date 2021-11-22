package com.cpucode.dataType.unitTest

/**
 * @author : cpucode
 * @date : 2021/11/22 10:17
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object UnitTest {
  def main(args: Array[String]): Unit = {
    // 空类型
    //空值Unit
    def m1(): Unit = {
      println("m1被调用执行")
    }

    val a: Unit = m1()
    println("a : " + a)


    // 空引用Null
    //    val n: Int = null    // error

    var student: Student = new Student("cpu", 10)
    student = null
    println(student)

    // Nothing
    def m2(n: Int): Int = {
      if (n == 0){
        throw new NullPointerException
      }else{
        return n
      }
    }

    val b: Int = m2(2)
    println("b: " + b)
  }

}
