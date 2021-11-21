package com.cpucode.identifier

/**
 * @author : cpucode
 * @date : 2021/11/21 17:07
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object Identifier {
  def main(args: Array[String]): Unit = {
    // 以字母或者下划线开头，后接字母、数字、下划线
    val cpuCode:String = "cpuCode"
    var cpu = "cpu"
    val _code = "_code"

    println(cpuCode)
    println(cpu)
    println(_code)

//    val c-p = "c-p"
//    val 12cpu = "12cpu"


    // 以操作符开头，且只包含操作符（+ - * / # !等）
    val -+/% = "-+/%"
    println(-+/%)

//    val -33 = "-33"


    //用反引号`....`包括的任意字符串，即使是Scala关键字（39个）也可以
    val `if` = "if"
    println(`if`)

  }

}
