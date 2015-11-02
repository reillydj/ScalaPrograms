object listfun {

  val nums = List(2, -4, 5, 7, 1)
  val fruits = List("apple", "pineapple", "orange", "banana")
  nums filter (x => x > 0)
  nums filterNot (x => x > 0)
  nums partition (x => x > 0)
  nums takeWhile (x => x > 0)
  nums dropWhile (x => x > 0)
  nums span (x => x > 0)

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 =>
      val (first, rest) = x :: xs1 span (y => y == x)
      first :: pack(rest)
  }

  pack(List("a", "a", "a", "b", "c", "c", "a"))
  def encode[T](xs: List[T]): List[(T, Int)] =
    pack(xs) map (x => (x.head, x.length))

  encode(List("a", "a", "a", "b", "c", "c", "a"))

  def mapFun[T, U](xs: List[T], f: T => U): List[U] =
    (xs foldRight List[U]())(f(_) :: _)

  def lengthFun[T](xs: List[T]): Int =
    (xs foldRight 0)((_, y) => y + 1)

  mapFun[Int, Int](List(1, 2, 3), x => x * x)
  lengthFun(List(1, 2, 3))
}