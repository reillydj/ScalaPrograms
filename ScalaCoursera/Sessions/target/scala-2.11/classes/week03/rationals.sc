import week03._

object rationals {
  val x = new Rational(1, 3)
  val y = new Rational(5, 7)
  val z = new Rational(3, 2)
  val a = new Rational(10000, 20000)
  a - x
  a + a
  a.numer
  a.denom
  val test = new NonEmpty(3, new Empty, new Empty)
  def error(msg: String) = throw new Error(msg)
  error("test")
}
