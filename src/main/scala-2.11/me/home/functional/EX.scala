package me.home.functional

/**
  * Created by before30 on 2016. 1. 18..
  */
object EX {
  def main(args: Array[String]) {
//    println((1 to 4).foldLeft(1)((l,r) => l*r))
    println(f(20.0F))
  }

  def f(x: Float):Float = {
    "%.4f".format(calc(x, 1, 1.0F)).toFloat
  }

  def calc(x: Float, step: Int, acc: Float): Float = {
    if (step >= 10) acc
    else {
      calc(x, step +1, acc + "%.4f".format((1 to step).foldLeft(1F)((l,r) => l * x) / (1 to step).foldLeft(1)((l,r) => l*r)).toFloat)
    }
  }
}
