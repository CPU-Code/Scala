package com.cpucode.collection.opeartion

/**
 * @author : cpucode
 * @date : 2021/11/23 10:03
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object ColleOpeartion {
  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(10, 20, 30, 40)

    // 对数组进行处理，将操作抽象出来，处理完毕之后的结果返回一个新的数组
    def arrayOperation(array: Array[Int], op: Int => Int): Array[Int] = {
      for (elem <- array) yield op(elem)
    }

    // 定义一个加一操作
    def addOne(elem: Int): Int = {
      elem + 1
    }

    // 调用函数
    val newArray: Array[Int] = arrayOperation(arr, addOne)

    println(newArray.mkString(", "))
    println("*****************************************************")

    // 采用匿名函数
    var arr1 = arrayOperation(arr, (ele: Int) => {
      ele + 1
    })

    println(arr1.mkString(", "))
    println("*****************************************************")


    // 参数的类型可以省略，会根据形参进行自动的推导
    var arr2 = arrayOperation(arr, (ele) => {
      ele + 1
    })

    println(arr2.mkString(", "))
    println("*****************************************************")

    // 类型省略之后，发现只有一个参数，则圆括号可以省略；
    // 其他情况：没有参数和参数超过 1 的永远不能省略圆括号
    val arr3 = arrayOperation(arr, ele => {
      ele + 1
    })

    println(arr3.mkString(", "))
    println("*****************************************************")


    // 匿名函数如果只有一行，则大括号也可以省略
    var arr4 = arrayOperation(arr, ele => ele + 1)

    println(arr4.mkString(", "))
    println("*****************************************************")


    // 如果参数只出现一次，则参数省略且后面参数可以用_代替
    val newArray2 = arrayOperation(arr, _ * 2)
    println(newArray2.mkString(", "))
  }
}
