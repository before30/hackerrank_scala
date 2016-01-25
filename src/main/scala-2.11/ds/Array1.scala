package ds

/**
  * Created by before30 on 2016. 1. 22..
  */
object Array1 {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    var arr = new Array[Int](n);
    for(arr_i <- 0 to n-1) {
      arr(arr_i) = sc.nextInt();
    }

    val revList = arr.reverse.toList
    println(revList.mkString(" "))
  }
}
