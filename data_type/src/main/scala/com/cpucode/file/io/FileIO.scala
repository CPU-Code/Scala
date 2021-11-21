package com.cpucode.file.io

import java.io.{File, PrintWriter}

import scala.io.Source

/**
 * @author : cpucode
 * @date : 2021/11/21 21:19
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object FileIO {
  def main(args: Array[String]): Unit = {
    // 1. 从文件中读取数据
    Source.fromFile("data_type/src/main/resources/test.txt").foreach(print)

    // 2. 将数据写入文件
    val writer = new PrintWriter(new File("data_type/src/main/resources/output.txt"))
    writer.write("cpu scala from java writer")
    writer.close()
  }
}
