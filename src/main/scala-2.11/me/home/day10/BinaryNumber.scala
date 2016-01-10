package me.home.day10

/**
 * Created by before30 on 2016. 1. 10..
 */
object BinaryNumber {

  def toBinaryList(num: Int, acc: List[Int]): List[Int] = {
    val quotient = num/2
    val reminder = num%2

    if (quotient == 0) reminder :: acc
    else toBinaryList(quotient, reminder :: acc)
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()

    var x = 0
    for (x <- 1 to n) {
      val inputNum = sc.nextInt
      println(toBinaryList(inputNum, Nil).mkString(""))
    }
  }
}
