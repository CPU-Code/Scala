package com.cpucode.commonWordCount

/**
 * @author : cpucode
 * @date : 2021/11/26 15:23
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object ComWordCount {
  def main(args: Array[String]): Unit = {
    val stringList: List[String] = List(
      "hello",
      "hello world",
      "hello scala",
      "hello spark from scala",
      "hello flink from scala api"
    )


    // 1. 对字符串进行切分，得到一个打散所有单词的列表
    val wordList: List[Array[String]] = stringList.map(_.split(" "))
    val wordCount: List[String] = wordList.flatten
    println(wordCount)
    println("*****************")

    val wordCount2 = stringList.flatMap(_.split(" "))
    println(wordCount2)
    println("*****************")

    // 2. 相同的单词进行分组
    val groupMap: Map[String, List[String]] = wordCount2.groupBy(word => word)
    println(groupMap)
    println("*****************")

    // 3. 对分组之后的list取长度，得到每个单词的个数
    val countMap: Map[String, Int] = groupMap.map(kv => (kv._1, kv._2.length))
    println(countMap)
    println("*****************")

    // 4. 将map转换为list，并排序取前3
    val sortList: List[(String, Int)] = countMap.toList
      .sortWith(_._2 > _._2)
      .take(3)

    println(sortList)
  }
}
