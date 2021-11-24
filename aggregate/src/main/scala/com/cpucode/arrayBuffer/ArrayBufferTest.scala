package com.cpucode.arrayBuffer

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * @author : cpucode
 * @date : 2021/11/24 16:30
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object ArrayBufferTest {
  def main(args: Array[String]): Unit = {
    // 1. 创建可变数组
    val arr1: ArrayBuffer[Int] = new ArrayBuffer[Int]()
    val arr2 = ArrayBuffer(23, 57, 92)

    println(arr1)
    println(arr2)
    println("*****************1*********************")

    // 2. 访问元素
//    println(arr1(0))     // error

    println(arr2(1))
    arr2(1) = 11
    println(arr2(1))
    println("*******************2*******************")


    // 3. 添加元素
    val newArr1 = arr1 :+ 15
    println(arr1)
    println(newArr1)
    println(arr1 == newArr1)
    println("********************3******************")


    val newArr2 = arr1 += 19
    println(arr1)
    println(newArr2)
    println(arr1 == newArr2)
    println("********************4******************")


    newArr2 += 13
    println("arr1 : " + arr1)
    println(arr1 == newArr2)
    println("***************5***********************")


    20 +=: arr1
    println(arr1)
    println("newArr2 : " + newArr2)
    println("***************6***********************")

    arr1.append(22)
    arr1.prepend(10, 20)
    arr1.insert(1, 30, 40)
    println("arr1 : " + arr1)
    println("***************7***********************")

    arr1.insertAll(2, newArr1)
    arr1.prependAll(newArr2)
    println("arr1 : " + arr1)
    println("****************8**********************")


    // 4. 删除元素
    arr1.remove(3)
    println("arr1 : " + arr1)
    println("***************9***********************")

    arr1.remove(0, 10)
    println(arr1)
    println("***************10***********************")


    arr1 -= 13
    println(arr1)
    println("****************11**********************")

    // 5. 可变数组转换为不可变数组
    val arr: ArrayBuffer[Int] = ArrayBuffer(10, 20, 30)
    val newArr: Array[Int] = arr.toArray
    println(newArr.mkString(" , "))
    println(arr)
    println("****************12**********************")


    // 6. 不可变数组转换为可变数组
    val buffer: mutable.Buffer[Int] = newArr.toBuffer
    println(buffer)
    println(newArr)
  }
}
