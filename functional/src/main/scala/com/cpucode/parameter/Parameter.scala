package com.cpucode.parameter

/**
 * @author : cpucode
 * @date : 2021/11/22 15:44
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object Parameter {
  def main(args: Array[String]): Unit = {
    // 可变参数
    def f1(str: String*): Unit = {
      println(str)
    }

    f1("cpu")
    f1("cpu", "code", "cpuCode")
    println("*******************************************************")


    //如果参数列表中存在多个参数，那么可变参数一般放置在最后
    def f2(str1: String, str2: String*): Unit = {
      println("str1 : " + str1 + "str2 : " + str2)
    }

    f2("cpu2")
    f2("cpu2", "code2", "cpuCode2")
    println("*******************************************************")


    //参数默认值，一般将有默认值的参数放置在参数列表的后面
    def f3(name: String = "cpuCode"): Unit = {
      println("我的名字 : " + name)
    }

    f3("cpu")
    f3()
    println("*******************************************************")


    // 带名参数
    def f4(name: String = "cpuCode", age: Int): Unit = {
      println(s"${age}岁的 ${name} 在疯狂学大数据")
    }

    f4("cpu", 20)
    f4(age = 23, name = "code")
    f4(age = 21)
  }
}
