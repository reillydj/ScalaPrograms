class Rational(x: Int, y: Int) {
  def numer = x
  def denom = x
}
object rationals {
  val x = new Rational(1, 3)
  x.numer
  x.denom
}