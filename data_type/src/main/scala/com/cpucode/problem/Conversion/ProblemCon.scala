package com.cpucode.problem.Conversion

/**
 * 128: Int类型，占据4个字节，32位
 * 原码 0000 0000 0000 0000 0000 0000 1000 0000
 * 补码 0000 0000 0000 0000 0000 0000 1000 0000
 *
 * 截取最后一个字节，Byte
 * 得到补码 1000 0000
 * 表示最大负数 -128
 *
 * 130: Int类型，占据4个字节，32位
 * 原码 0000 0000 0000 0000 0000 0000 1000 0010
 * 补码 0000 0000 0000 0000 0000 0000 1000 0010
 *
 * 截取最后一个字节，Byte
 * 得到补码 1000 0010
 * 对应原码 1111 1110
 *
 * @author : cpucode
 * @date : 2021/11/22 11:57
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object ProblemCon {
  def main(args: Array[String]): Unit = {
    var n: Int = 128
    var n2: Int = 130

    val b: Byte = n.toByte
    val b2: Byte = n2.toByte

    println(b)
    println(b2)
  }
}
