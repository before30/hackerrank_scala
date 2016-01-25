package ds

/**
  * Created by before30 on 2016. 1. 22..
  */
object Array2 {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);

    var arr = Array.ofDim[Int](6,6);
    for(arr_i <- 0 to 6-1) {
      for(arr_j <- 0 to 6-1){
        arr(arr_i)(arr_j) = sc.nextInt();
      }
    }

    val results = for (x <- 1 to 4; y <- 1 to 4 ) yield {
      arr(x-1)(y-1) + arr(x-1)(y) + arr(x-1)(y+1) +
      arr(x)(y) +
      arr(x+1)(y-1) + arr(x+1)(y) + arr(x+1)(y+1)
    }

    println(results.foldLeft(Int.MinValue)((x, y) => {
      if (x<y) y
      else x
    }))

  }

}
