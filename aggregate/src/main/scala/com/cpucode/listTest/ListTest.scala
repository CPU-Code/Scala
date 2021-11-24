package com.cpucode.listTest

/**
 * @author : cpucode
 * @date : 2021/11/24 18:28
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object ListTest {
  def main(args: Array[String]): Unit = {
    // 1. 创建一个List
    val list1 = List(10, 20, 30)
    println(list1)
    println("*************************************")

    // 2. 访问和遍历元素
    println(list1(1))
    println("*************************************")
//    list1(1) = 40

    list1.foreach(println)
    println("*************************************")

    // 3. 添加元素
    val list2 = 10 +: list1
    val list3 = list1 :+ 20

    println(list1)
    println(list2)
    println(list3)
    println("*************************************")


    val list4 = list2.::(40)
    println(list4)
    println("*************************************")


    val list5 = Nil.::(50)
    println(list5)
    println("*************************************")


    val list6 = 73 :: 32 :: Nil
    val list7 = 17 :: 28 :: 59 :: 16 :: Nil
    println(list7)
    println("*************************************")


    // 4. 合并列表
    val list8 = list6 :: list7
    println(list8)
    println("*************************************")


    val list9 = list6 ::: list7
    println(list9)
    println("*************************************")


    val list10 = list6 ++ list7
    println(list10)
  }
}
