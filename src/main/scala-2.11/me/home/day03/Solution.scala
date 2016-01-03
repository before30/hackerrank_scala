package me.home.day03

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    val num = sc.nextInt();

    val msg = num match {
      case x if (x % 2 != 0) => "Weird"
      case x if (x >= 2 && x <= 5) => "Not Weird"
      case x if (x >= 6 && x <= 20) => "Weird"
      case _ => "Not Weird"
    }

    println(msg)
  }
}
