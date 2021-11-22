package com.cpucode.dataType.charType

/**
 * @author : cpucode
 * @date : 2021/11/22 10:02
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object CharType {
  def main(args: Array[String]): Unit = {

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
