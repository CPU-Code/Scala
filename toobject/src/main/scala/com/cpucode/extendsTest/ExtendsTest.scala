package com.cpucode.extendsTest

/**
 * @author : cpucode
 * @date : 2021/11/24 13:49
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object ExtendsTest {
  def main(args: Array[String]): Unit = {
    // 类型的检测和转换
    val student: Student17 = new Student17("cpu", 18)
    student.study()
    student.sayHi()
    println("***********************************")

    val person: Person17 = new Student17("cpuCode", 20)
    person.sayHi()
    println("***********************************")


    // 类型判断
    println("student is Student17: " + student.isInstanceOf[Student17])
    println("student is Person17: " + student.isInstanceOf[Person17])
    println("person is Person17: " + person.isInstanceOf[Person17])
    println("person is Student17: " + person.isInstanceOf[Student17])
    println("*********************************************")


    val person2: Person17 = new Person17("code", 30)
    println("person2 is Student17: " + person2.isInstanceOf[Student17])
    println("person2 is Person17: " + person2.isInstanceOf[Person17])
    println("*********************************************")


    // 类型转换
    if (person.isInstanceOf[Student17]){
      // 将对象转换为某个类型的实例
      val newStudent = person.asInstanceOf[Student17]
      newStudent.study()
    }
    println("*********************************************")

    // 获取类的信息
    println(classOf[Student17])

    // 2. 测试枚举类
    println(WorkDay.MONDAY)

  }
}

/**
 * 定义应用类对象
 */
object TestApp extends App {
  println("app start")

  // Type 定义新类型
  type MyString = String
  val a: MyString = "abc"

  println(a)
}


class Person17(val name: String, val age: Int){
  def sayHi(): Unit = {
    println("hi from Person17 " + name)
  }
}

class Student17(name: String, age: Int) extends Person17(name, age){
  override def sayHi(): Unit = {
    println("hi from Student17 " + name)
  }

  def study(): Unit = {
    println("student study")
  }
}


/**
 * 定义枚举类对象
 */
object WorkDay extends Enumeration {
  val MONDAY = Value(1, "Monday")
  val TUESDAY = Value(2, "TuesDay")
}

