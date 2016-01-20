package me.home.functional

/**
  * Created by before30 on 2016. 1. 19..
  */
object Integrals {
  def f(coefficients:List[Int],powers:List[Int],x:Double):Double =
  {
    //Fill Up this function body
    // To compute the value of the function
    // For the given coefficients, powers and value of x
    calcAlgebric(coefficients, powers, x, 0)
  }

  def calcAlgebric(c:List[Int], p:List[Int], x:Double, acc:Double): Double = {
    if (c == Nil) acc
    else {
      calcAlgebric(c.tail, p.tail, x, acc + c.head * Math.pow(x, p.head))
    }
  }

  // This function will be used while invoking "Summation" to compute
  // The Volume of revolution of the curve around the X-Axis
  // The 'Area' referred to here is the area of the circle obtained
  // By rotating the point on the curve (x,f(x)) around the X-Axis
  def area(coefficients:List[Int],powers:List[Int],x:Double):Double =
  {
    //Fill Up this function body
    // To compute the area of the circle on revolving the point
    // (x,f(x)) around the X-Axis
    // For the given coefficients, powers and value of x
    3.14 * Math.pow(f(coefficients, powers, x), 2.0D)
  }

  // This is the part where the series is summed up
  // This function is invoked once with func = f to compute the area         // under the curve
  // Then it is invoked again with func = area to compute the volume
  // of revolution of the curve
  def summation(func:(List[Int],List[Int],Double)=>Double,upperLimit:Int,lowerLimit:Int,coefficients:List[Int],powers:List[Int]):Double =
  {
    // Fill up this function
    val sum = for (x <- lowerLimit.toDouble to upperLimit.toDouble by 0.001) yield func(coefficients, powers, x)*0.001
    sum.sum
  }

  def main(args: Array[String]) {
    println(summation(f,20, 0, 1::0::Nil, 0::1::Nil))
  }
}
