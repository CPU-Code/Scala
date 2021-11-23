package com.cpucode.packAgeObject

/**
 * @author : cpucode
 * @date : 2021/11/23 15:53
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
package PackAgeObject{
  object PackageObject {
    def main(args: Array[String]): Unit = {
      commonMethod()
      println(commonValue)
    }
  }
}

package ccc {
  package ddd {
    object PackageObject {
      def main(args: Array[String]): Unit = {
        println(school)
      }
    }
  }
}

/**
 * 定义一个包对象
 */
package object ccc {
  val school: String = "cpuCode"
}