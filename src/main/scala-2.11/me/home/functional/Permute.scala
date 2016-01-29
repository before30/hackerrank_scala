package me.home.functional

import scala.io.StdIn

/**
  * Created by before30 on 2016. 1. 29..
  */
object Permute {

  def main(args: Array[String]) {
    val n = StdIn.readInt()
    for ( x <- 1 to n) {
      val input = StdIn.readLine()
      println(input.toList.grouped(2).toList.map(x => x.reverse).flatten.mkString)
    }
  }
}
