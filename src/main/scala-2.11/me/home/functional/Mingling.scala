package me.home.functional

import scala.io.StdIn

/**
  * Created by before30 on 2016. 1. 29..
  */
object Mingling {

  def main(args: Array[String]) {
    val input1 = StdIn.readLine()
    val p = input1.toList
    val input2 = StdIn.readLine()
    val q = input2.toList
    val r = p zip q
    println(r.map(x => "" + x._1 + x._2).mkString)
  }
}
