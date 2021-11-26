package com.cpucode.highMap

/**
 * @author : cpucode
 * @date : 2021/11/26 13:47
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */
object HighMap {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)

    // 1. 过滤
    // 选取偶数
    val evenList = list.filter((elem: Int) => {elem % 2 == 0})
    println(evenList)

    // 选取奇数
    println(list.filter(_ % 2 == 1))
    println("**************************")


    // 2. 映射map
    // 把集合中每个数乘2
    println(list.map(_ * 2))
    println(list.map(x => x * x))
    println("**************************")


    // 3. 扁平化
    val nestedList: List[List[Int]] = List(List(1, 2, 3), List(4, 5), List(6, 7, 8, 9))
    val flatList = nestedList(0) ::: nestedList(1) ::: nestedList(2)
    println(flatList)
    println("**************************")

    val flatList2 = nestedList.flatten
    println(flatList2)
    println("**************************")

    // 4. 扁平映射
    // 将一组字符串进行分词，并保存成单词的列表
    val strings: List[String] = List("cpu java", "code scala", "cpuCode hadoop")
    // 分词
    val splitList: List[Array[String]] = strings.map(_.split(" "))
    // 打散扁平化
    val flattenList = splitList.flatten

    println(flattenList)
    println("**************************")

    val flatMapList = strings.flatMap(_.split(" "))
    println(flatMapList)
    println("**************************")

    // 5. 分组groupBy
    // 分成奇偶两组
    val groupMap: Map[Int, List[Int]] = list.groupBy(_ % 2)
    val groupMap1: Map[String, List[Int]] = list.groupBy(data => if (data % 2 == 0) "偶数" else "奇数")

    println(groupMap)
    println(groupMap1)
    println("**************************")


    // 给定一组词汇，按照单词的首字母进行分组
    val wordList = List("cpu", "java", "code", "cpuCode", "hadoop", "scala")
    println(wordList.groupBy(_.charAt(0)))
  }
}
