package me.home.day06

/**
 * Created by before30 on 2016. 1. 6..
 */
object Structure {
  def printLine(size: Int, changePoint: Int): Int = {
    if (size == 0) return 0
    else if ( size <= changePoint ) print("#")
    else print(" ")

    printLine(size - 1, changePoint)
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val n = sc.nextInt()

    var height = 0
    for (height <- 1 to n ) {
      printLine(n, height)
      println()
    }
  }
}
