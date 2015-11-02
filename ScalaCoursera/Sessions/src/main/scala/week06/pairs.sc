object pairs {


  def isPrime(n: Int): Boolean =
    !(2 until n exists (n % _ == 0))

  val n = 10
  for {
    i <- 1 until n
    j <- 1 until i
    if isPrime(i + j)
  } yield (i, j)

  def scalarProduct(xs: List[Double], ys: List[Double]): Double =
    (xs zip ys).map(xy => xy._1 * xy._2).sum

  def scalarProductFor(xs: List[Double], ys: List[Double]): Double =
    (for { (x, y) <- xs zip ys } yield x * y).sum

  scalarProductFor(List(1.0, 2.0), List(1.0, 2.0))
}