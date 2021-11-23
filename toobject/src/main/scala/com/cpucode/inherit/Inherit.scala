package com.cpucode.inherit


/**
 * @author : cpucode
 * @date : 2021/11/23 19:21
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object Inherit {
  def main(args: Array[String]): Unit = {
    val student1: Student7 = new Student7("cpuCode", 22)
    println("******************************************")

    val student2 = new Student7("cpu", 22, "xxx")
    println("******************************************")

    student1.printInfo()
    println("******************************************")

    student2.printInfo()
    println("****************** student2.printInfo()****************")

    val teacher = new Teacher
    teacher.printInfo()
    println("*************** teacher.printInfo() ***************************")

    def personInfo(person: Person7): Unit = {
      person.printInfo()
    }

    personInfo(student1)
    println("****************personInfo(student1)**************************")

    personInfo(teacher)
    println("******************************************")

    val person = new Person7
    personInfo(person)
    println("******************************************")
  }
}


/**
 * 定义一个父类
 */
class Person7() {
  var name: String = _
  var age: Int = _

  println("Person7 父类的主构造器调用")

  def this(name: String, age: Int){
    this()
    println("Person7 父类的辅助构造器调用")
    this.name = name
    this.age = age
  }

  def printInfo(): Unit = {
    println(s"Person: ${name}   ${age}")
  }
}

/**
 * 定义子类
 * @param name
 * @param age
 */
class Student7(name: String, age: Int) extends Person7(name, age) {
  var stdNo: String = _

  println("Student7 子类的主构造器调用")

  def this(name: String, age: Int, stdNo: String){
    this(name, age)
    println("Student7 子类的辅助构造器调用")
    this.stdNo = stdNo
  }

  override def printInfo(): Unit = {
    println(s"Student: $name $age $stdNo")
  }
}

class Teacher extends Person7 {
  override def printInfo(): Unit = {
    println("Teacher")
  }
}