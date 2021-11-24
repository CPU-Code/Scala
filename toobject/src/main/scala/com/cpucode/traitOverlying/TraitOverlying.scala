package com.cpucode.traitOverlying

/**
 * @author : cpucode
 * @date : 2021/11/24 13:38
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object TraitOverlying {
  def main(args: Array[String]): Unit = {
    // 钻石问题特征叠加
    val myFootBall = new MyFootBall
    println(myFootBall.describe())
    println("************************************")

    val student = new Student15
    student.increase()
  }
}

/**
 * 定义球类特征
 */
trait Ball {
  def describe(): String = "ball"
}

/**
 * 定义颜色特征
 */
trait ColorBall extends Ball {
  var color: String = "red"

  override def describe(): String = color + "-" + super.describe()
}

/**
 * 定义种类特征
 */
trait CategoryBall extends Ball {
  var category: String = "foot"

  override def describe(): String = category + "-" + super.describe()
}

/**
 * 定义一个自定义球的类
 */
class  MyFootBall extends CategoryBall with ColorBall {
  override def describe(): String = "my ball is " + super.describe()
}

trait Knowledge15 {
  var amount: Int = 0
  def increase(): Unit = {
    println("knowledge increased")
  }
}

trait Talent15 {
  def singing(): Unit
  def dancing(): Unit
  def increase(): Unit = {
    println("talent increased")
  }
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

class Student15 extends Person13 with Talent15 with Knowledge15 {
  override def dancing(): Unit = println("dancing")

  override def singing(): Unit = println("singing")

  override def increase(): Unit = {
    super[Person13].increase()
  }
}

