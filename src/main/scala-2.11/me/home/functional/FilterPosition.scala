package me.home.functional

/**
  * Created by before30 on 2016. 1. 18..
  */
object FilterPosition {

  def recursiveF(arr:List[Int], isOdd: Boolean, acc:List[Int]): List[Int] = {
    if (arr == Nil) acc.reverse
    else if(isOdd == true) {
      recursiveF(arr.tail, false, arr.head :: acc)
    } else {
      recursiveF(arr.tail, true, acc)
    }
  }
  def f(arr:List[Int]):List[Int] = {
    recursiveF(arr, false, Nil)
//    arr.grouped(2).map(x => x.tail.head).toList
  }

  def main(args: Array[String]) {
    (1 to 10).toList
//    println(f(2
//    :: 5
//    :: 3
//    :: 4
//    :: 6
//    :: 7
//      :: 8
//    :: 9
//    :: Nil))
  }


  println((11::25::18::(-1)::26::(-20)::(-19)::23::(-24)::(-8)::Nil).filter(x => x%2 == 1 || x%2 == -1).sum)

  println((3::5::1::2::4::Nil).filter(x => x>0 &&x%2==1).sum)

  println((999::1::2::3::100::Nil).foldLeft(0)((x,y) => x+1))

  println(((-1)::2::(-3)::4::Nil).map(x => if (x<0) x * -1 else x))
}
