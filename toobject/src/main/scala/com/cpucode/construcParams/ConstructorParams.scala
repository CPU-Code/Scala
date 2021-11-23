package com.cpucode.construcParams

/**
 * @author : cpucode
 * @date : 2021/11/23 19:10
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object ConstructorParams {
  def main(args: Array[String]): Unit = {
    val student2 = new Student2
    student2.name = "cpu"
    student2.age = 22
    println(s"student2: name = ${student2.name}, age = ${student2.age}")
    println("**************************************")


    val student3 = new Student3("code", 20)
    student3.age = 21

    println(s"student3: name = ${student3.name}, age = ${student3.age}")
    println("**************************************")


    val student4 = new Student4("cpu", 25)
    //println(s"student4: name = ${student4.name}, age = ${student4.age}")
    student4.printInfo()
    println("**************************************")


    val student5 = new Student5("cpu", 20)
    println(s"student5: name = ${student5.name}, age = ${student5.age}")
    println("**************************************")


    val student6 = new Student6("code", 25, "cpuCode")
    println(s"student6: name = ${student6.name}, age = ${student6.age}, ${student6.school}")
    student6.printInfo()
  }
}

/**
 * 定义类
 * 无参构造器
 */
class Student2 {
  var name: String = _
  var age: Int = _
}


/**
 * 上面定义等价于
 * @param name
 * @param age
 */
class Student3(var name: String, var age: Int)

class Student4(name: String, age:Int){
  def printInfo(): Unit = {
    println(s"student4: name = ${name}, age = $age")
  }
}


class Student5(val name: String, val age: Int)

class Student6(var name: String, var age: Int){
  var school: String = _

  def this(name: String, age: Int, school: String){
    this(name, age)
    this.school = school
  }

  def printInfo(): Unit ={
    println(s"student6: name = ${name}, age = $age, school = $school")
  }
}