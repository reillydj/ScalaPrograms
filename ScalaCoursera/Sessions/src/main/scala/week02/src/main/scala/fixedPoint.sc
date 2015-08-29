object fixedPoint {

  val tolerance = 0.0001
  def abs(x: Double): Double =
    if (x < 0) -x
    else x

  def isCloseEnough(x: Double, y:Double): Boolean =
    abs((x - y) / x) / x < tolerance

  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }
    iterate(firstGuess)
  }

//  def sqrt(x: Double): Double =
//    fixedPoint(y => (y + x / y) / 2)(1.0)


  def averageDamp(f: Double => Double)(x: Double) =
    (x + f(x)) / 2

  def sqrt(x: Double) =
    fixedPoint(averageDamp(y => x / y))(1.0)

  fixedPoint(x => 1 + x / 2)(1.0)

  sqrt(10)


}