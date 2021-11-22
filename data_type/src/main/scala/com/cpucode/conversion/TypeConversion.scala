package com.cpucode.conversion

/**
 * @author : cpucode
 * @date : 2021/11/22 10:54
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object TypeConversion {
  def main(args: Array[String]): Unit = {
    //自动提升原则：
    // 有多种类型的数据混合运算时，系统首先自动将所有数据转换成精度大的那种数据类型，然后再进行计算
    val a1: Byte = 10
    val b1: Long = 222
    val result1: Long = a1 + b1
//    val result2: Int = a1 + b1
    // 强转
    val result3: Int = (a1 + b1.toInt)

    println(result1)
    println(result3)


    //把精度大的数值类型赋值给精度小的数值类型时，就会报错，反之就会进行自动类型转换
    val a2: Byte = 10
    val b2: Int = a2

//    val c1: Byte = b2
    val c2: Byte = b2.toByte

    println(b2)
    println(c2)

    // （byte，short）和char之间不会相互自动转换
    val b3: Char = 'a'
//    val c3: Byte = b3
    val c4: Byte = b3.toByte

    val c5: Int = b3

    println(c4)
    println(c5)

    // byte，short，char他们三者可以计算，在计算时首先转换为int类型
    val a4: Byte = 12
    val b4: Short = 25
    val c6: Char = 'c'

    val result4: Int = a4 + b4
    val result5: Int = a4 + b4 + c6

    println(result4)
    println(result5)

  }

}
