package com.cpucode.pack.age

/**
 * @author : cpucode
 * @date : 2021/11/23 13:51
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
package PackAge {

  /**
   * 父包访问子包需要导包
   */
  import com.cpucode.pack.age.PackAge.cpuCode.SCala.Inner

  /**
   * 在外层包中定义单例对象
   */
  object Outer {
    var out: String = "out"

    def main(args: Array[String]): Unit = {
      println(Inner.in)
    }
  }

  package cpuCode {
    package SCala {

      /**
       * 内层包中定义单例对象
       */
      object Inner {
        var in: String = "in"

        def main(args: Array[String]): Unit = {
          // 子包访问父包无需导包
          println(Outer.out)

          Outer.out = "outer"
          println(Outer.out)
        }
      }
    }
  }
}

/**
 * 在同一文件中定义不同的包
 */
package aaa{
  package bbb{

    import com.cpucode.pack.age.PackAge.cpuCode.SCala.Inner

    object PackAge {
      def main(args: Array[String]): Unit = {
        println(Inner.in)
      }
    }
  }

}
