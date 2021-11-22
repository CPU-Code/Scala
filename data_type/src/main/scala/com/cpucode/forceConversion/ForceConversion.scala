package com.cpucode.forceConversion

/**
 * @author : cpucode
 * @date : 2021/11/22 11:45
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object ForceConversion {
  def main(args: Array[String]): Unit = {
    //强制类型转换
    // 将数据由高精度转换为低精度，就需要使用到强制转换
    val n1: Int = -2.9.toInt
    println("n1: " + n1)

    //强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
    val n2: Int = 2.6.toInt + 3.7.toInt
    val n3: Int = (2.6 + 3.7).toInt

    println("n2: " + n2)
    println("n3: " + n3)

    // 数值类型和String类型的转换
    //  数值转String
    val n: Int = 22
    val s: String = n + ""
    val s2: String = n.toString

    println(s)
    println(s2)

    // String转数值
    val m: Int = "22".toInt
    val f: Float = "12.345".toFloat
//    val f2: Int = "12.345".toInt
    val f3: Int = "12.345".toDouble.toInt

    println(m)
    println(f)
    println(f3)
  }

}
