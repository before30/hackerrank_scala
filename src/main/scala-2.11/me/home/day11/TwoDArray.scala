package me.home.day11

import java.util
import scala.collection.JavaConversions._

/**
 * Created by before30 on 2016. 1. 11..
 */
object TwoDArray {

  def calc(arr: Array[Array[Int]], x: Int, y: Int): Int = {
    arr(x)(y) + arr(x)(y+1) + arr(x)(y+2) + arr(x+1)(y+1) + arr(x+2)(y) + arr(x+2)(y+1) + arr(x+2)(y+2)
  }
  def calcHourGlasses(arr: Array[Array[Int]]): Int = {
    val list = new util.ArrayList[Int]

    for (arr_i <- 0 to 4 - 1; arr_j <- 0 to 4 - 1) {
      list.add(calc(arr, arr_i, arr_j))
    }

    val scalaList = list
    scalaList.max
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var arr = Array.ofDim[Int](6,6);
    for(arr_i <- 0 to 6-1) {
      for(arr_j <- 0 to 6-1){
        arr(arr_i)(arr_j) = sc.nextInt();
      }
    }

    println(calcHourGlasses(arr))
  }

}
