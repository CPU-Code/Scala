package com.cpucode.access

/**
 * @author : cpucode
 * @date : 2021/11/23 16:03
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object Access {
  def main(args: Array[String]): Unit = {
    // 创建对象
    val person: Person = new Person()

    //    person.idCard    // error
    //    person.name    // error

    println(person.age)
    println(person.sex)
    person.printInfo()
    println("*******************")


    var worker: Worker = new Worker()

    worker.printInfo()
  }
}

class Worker extends Person {
  override def printInfo(): Unit = {
    name = "code"
    age = 20
    sex = "male"

    println(s"Worker: $name $sex $age")
  }

}