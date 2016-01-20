package me.home.functional.fibonacci

/**
  * Created by before30 on 2016. 1. 20..
  */
object Solution {

  def fibonacci(x:Int):Int = {
    if (x == 1 ) 0 else if (x==2) 1
    else fibonacci(x-1) + fibonacci(x-2)
    // Fill Up this function body
    // You can add another function as well, if required
  }

  def main(args: Array[String]) {
    /** This will handle the input and output**/
    println(fibonacci(readInt()))

  }
}