package tuple

/**
 * @author : cpucode
 * @date : 2021/11/26 10:41
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object TupleTest {
  def main(args: Array[String]): Unit = {
    // 元组中最大只能有 22 个元素
    // 1. 创建元组
    val tuple: (String, Int, Char, Boolean) = ("cpu", 99, 'b', true)
    println(tuple)
    println("****************************")

    // 2. 访问数据
    // 通过元素的顺序进行访问，调用方式： _顺序号
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
    println(tuple._4)
    println("****************************")

    // 通过索引访问数据
    println(tuple.productElement(1))
    println("****************************")

    //通过迭代器访问数据
    for (elem <- tuple.productIterator){
      println(elem)
    }
    println("****************************")

    // Map 中的键值对其实就是元组,只不过元组的元素个数为 2，称之为对偶
    // 4. 嵌套元组
    val mulTuple = (22, 0.4, "code", (20, "scala"), 30)
    println(mulTuple._4._2)
  }
}
