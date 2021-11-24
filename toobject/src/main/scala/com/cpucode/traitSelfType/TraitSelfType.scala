package com.cpucode.traitSelfType

/**
 * @author : cpucode
 * @date : 2021/11/24 13:46
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object TraitSelfType {
  def main(args: Array[String]): Unit = {
    val user = new RegisterUser("cpu", "cpuCode")
    user.insert()
  }
}

class User(val name: String, val password: String)

trait UserDao {
  _: User =>

  /**
   * 向数据库插入数据
   */
  def insert(): Unit = {
    println(s"insert into db: ${this.name}")
  }
}

class RegisterUser(name: String, password: String) extends User(name, password) with UserDao