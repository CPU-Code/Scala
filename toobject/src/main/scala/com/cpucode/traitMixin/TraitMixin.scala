package com.cpucode.traitMixin

/**
 * @author : cpucode
 * @date : 2021/11/24 12:14
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object TraitMixin {
  def main(args: Array[String]): Unit = {
    val student = new Student14
    student.study()
    student.increase()
    println("*********************************")

    student.play()
    student.increase()
    println("*********************************")

    student.dating()
    student.increase()

    println("*********************************")

    // 动态混入
    val studentWithTalent = new Student14 with Talent {
      override def dancing(): Unit = println("student is good at dancing")
      override def singing(): Unit = println("student is good at singing")
    }

    studentWithTalent.sayHello()
    println("*********************************")


    studentWithTalent.play()
    studentWithTalent.study()
    println("*********************************")


    studentWithTalent.dating()
    studentWithTalent.dancing()
    studentWithTalent.singing()
  }
}

/**
 * 再定义一个特质
 */
trait Knowledge {
  var amount: Int = 0
  def increase(): Unit
}

/**
 * 定义一个特质
 */
trait Young {
  /**
   * 声明抽象
   */
  var age: Int
  /**
   * 非抽象属性
   */
  val name: String = "young"

  /**
   * 声明非抽象的方法
   */
  def play(): Unit ={
    println(s"young people $name is playing")
  }

  /**
   * 声明抽象的方法
   */
  def dating(): Unit
}


/**
 * 定义一个父类
 */
class Person13 {
  val name: String = "Person13"
  var age: Int = 20

  def sayHello(): Unit = {
    println("hello from: " + name)
  }

  def increase(): Unit ={
    println("Person13 increase")
  }
}

class Student14 extends Person13 with Young with Knowledge {
  /**
   * 重写冲突的属性
   */
  override val name: String = "Student14"

  /**
   * 重写父类方法
   */
  override def sayHello(): Unit = {
    super.sayHello()

    println(s"hello from: Student14 $name")
  }

  /**
   * 实现特质中的抽象方法
   */
  override def increase(): Unit = {
    amount += 1
    println(s"Student14 $name knowledge increased: $amount")
  }

  /**
   * 实现抽象的方法
   */
  override def dating(): Unit = {
    println(s"Student14 $name is dating")
  }

  def study(): Unit = println(s"Student14 $name is studying")

}

trait Talent {
  def singing(): Unit
  def dancing(): Unit
}