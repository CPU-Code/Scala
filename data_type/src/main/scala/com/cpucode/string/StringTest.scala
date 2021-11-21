package com.cpucode.string

/**
 * @author : cpucode
 * @date : 2021/11/21 17:36
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object StringTest {
  def main(args: Array[String]): Unit = {
    //字符串，通过+号连接
    val name: String = "cpu"
    val age: Int = 10
    println(age + "岁的" + name + "天天就知道学习")

    // *用于将一个字符串复制多次并拼接
    println(name * 2)

    //printf用法：字符串，通过%传值
    printf("%d岁的%s天天就知道学习\n", age, name)


    //字符串模板（插值字符串）：通过$获取变量值
    println(s"${age}岁的${name}天天就知道学习")

    var num: Double = 321.323
    // 格式化模板字符串
    println(f"这个 num = ${num}%2.2f")
    println(raw"这个 num = ${num}%2.2f")

    // 三引号表示字符串，保持多行字符串的原格式输出
    val sql =
      s"""
         |select *
         |from
         |  student
         |where
         |  name = ${name}
         |and
         |  age > ${age}
         |""".stripMargin

    println(sql)

    val s2 = s"name=$name"
    println(s2)
  }

}
