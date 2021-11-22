package com.cpucode.dataType

/**
 * @author : cpucode
 * @date : 2021/11/22 9:32
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object DataType {
  def main(args: Array[String]): Unit = {
    // 1. 整数类型
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


    //浮点类型
    val f1: Float = 12.3456f
    val d1 = 23.4567

    println(f1)
    println(d1)


    //字符类型
    val c1: Char = 'a'
    val c2: Char = '9'

    println(c1)
    println(c2)

    // 控制字符
    val c3: Char = '\t'
    val c4: Char = '\n'

    println("abc" + c3 + "def")
    println("abc" + c4 + "def")

    // 转义字符
    val c5 = '\\'
    val c6 = '\"'

    println("abc" + c5 + "def")
    println("abc" + c6 + "def")

    // 字符变量底层保存ASCII码
    val i1: Int = c1
    val i2: Int = c2

    println(i1)
    println(i2)

    val c7: Char = (i1 + 1).toChar
    val c8: Char = (i2 - 1).toChar

    println(c7)
    println(c8)

  }

}
