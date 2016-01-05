package me.home.day05

import java.util.Scanner

object Loops {

  def calc(a: Int, b: Int, n: Int, sum: Int): Int = {
    if (n==1) {
      a + b * (1 + sum)
    } else {
      calc(a, b, n-1, 2 * (1 + sum))
    }
  }

  def main(args: Array[String]) {
    val sc: Scanner = new Scanner(System.in)
    val T = sc.nextInt()
    var i=0

    for(i<-1 to T){
      val a = sc.nextInt()
      val b = sc.nextInt()
      val n = sc.nextInt()

      for (j<- 1 to n) {
        print(calc(a, b, j, 0) + " ")

      }
      println()

    }
  }
}
