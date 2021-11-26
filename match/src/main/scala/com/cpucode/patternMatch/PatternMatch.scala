package com.cpucode.patternMatch

/**
 * @author : cpucode
 * @date : 2021/11/26 16:04
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object PatternMatch {
  def main(args: Array[String]): Unit = {
    //  基本定义语法
    val x: Int = 10
    val y: String = x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case _ => "other"
    }
    println(y)
    println("***********************")

    //用模式匹配实现简单二元运算
    val a = 20
    val b = 30

    def matchDualOp(op: Char): Int = op match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case '%' => a % b
      case _ => -1
    }
    println(matchDualOp('+'))
    println(matchDualOp('/'))
    println(matchDualOp('\\'))
    println("***********************")

    // 3. 模式守卫
    // 求一个整数的绝对值
    def abs(num: Int): Int = {
      num match {
        case i if i >= 0 => i
        case i if i < 0 => -i
      }
    }

    println(abs(40))
    println(abs(0))
    println(abs(-30))

  }
}
