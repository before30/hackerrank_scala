package me.home.day09

/**
 * Created by before30 on 2016. 1. 9..
 */
object Recursion {

//  def gcd(x: Int, y: Int): Int = {
//    if ( x == y ) x
//    else gcd(Math.max(x, y) - Math.min(x, y), Math.min(x, y))
//
//  }
//
//  def main(args: Array[String]) {
//    val sc = new java.util.Scanner (System.in);
//    val a = sc.nextInt
//    val b = sc.nextInt
//
//    println(gcd(a, b))
//  }

  def gcd(x: Int, y: Int): Int =
  {
      if ( x == y ) x
      else gcd(Math.max(x, y) - Math.min(x, y), Math.min(x, y))
  }


  /**This part handles the input/output. Do not change or modify it **/
  def acceptInputAndComputeGCD(pair:List[Int]) = {
    println(gcd(pair.head,pair.reverse.head))
  }

  def main(args: Array[String]) {
    /** The part relates to the input/output. Do not change or modify it **/
    acceptInputAndComputeGCD(readLine().trim().split(" ").map(x=>x.toInt).toList)

  }
}
