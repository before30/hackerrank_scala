package me.home.day07

/**
 * Created by before30 on 2016. 1. 7..
 */
object ReverseOrder {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    sc.nextLine()
    println(sc.nextLine().split(" ").toList.reverse.mkString(" "))
  }
}
