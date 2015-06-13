import week03.Rational
object rationals {
  val x = new Rational(1, 3)
  val y = new Rational(5, 7)
  val z = new Rational(3, 2)
  x.numer
  x.denom
  x.sub(y).sub(z)
  y.add(y)
}
