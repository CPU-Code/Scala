package com.cpucode.dataType.intType

/**
 * @author : cpucode
 * @date : 2021/11/22 10:01
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object IntType {
  def main(args: Array[String]): Unit = {
    // 整数类型
    val a1: Byte = 127
    val a2: Byte = -128

    //    val a3: Byte = 128 // error
    //    val a33: Byte = -129

    println(a1)
    println(a2)


    // 整数默认类型为Int
    val a4 = 10
    // 长整型数值定义
    val a5: Long = 1234567891023L

    println(a4)
    println(a5)


    val b1: Byte = 20
    val b2: Byte = 10 + 20
    println(b1)
    println(b2)

    //    val b3: Byte = b1 + 10
    val b4: Byte = (b1 + 20).toByte

    println(b4)
  }

}
