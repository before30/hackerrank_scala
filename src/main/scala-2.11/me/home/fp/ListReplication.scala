package me.home.fp

/**
 * Created by before30 on 2016. 1. 17..
 */
object ListReplication {

  def f(num:Int,arr:List[Int]):List[Int] = {

    arr.map(x => List.fill(num)(x)).flatten
  }

  def f2(delim:Int,arr:List[Int]):List[Int] = {
    arr.filter(x => x<delim)
  }

  def main(args: Array[String]) {
    println(f(3, 1 :: 2 :: 3 :: Nil))
    println(f2(3, 1::2::3::4::5::0::Nil))
  }
}
