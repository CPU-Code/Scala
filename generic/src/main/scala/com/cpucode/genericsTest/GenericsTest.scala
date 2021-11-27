package com.cpucode.genericsTest

/**
 * @author : cpucode
 * @date : 2021/11/27 15:13
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object GenericsTest {
  def main(args: Array[String]): Unit = {

    val child: Parent = new Child

    // 1. 协变和逆变
    //    val childList: MyCollection[Parent] = new MyCollection[Child]
    val childList: MyCollection[SubChild] = new MyCollection[SubChild]

    // 2. 上下限
    def test[A <: Child](a: A): Unit = {
      println(a.getClass.getName)
    }

    test[SubChild](new SubChild)
  }
}

/**
 * 定义继承关系
 */
class Parent {}
class Child extends Parent{}
class SubChild extends Child {}

/**
 * 定义带泛型的集合类型
 * @tparam E
 */
class MyCollection[-E] {}