
// Find the second to last element of a list
object penUltimate {
  def penultimate[T](list: List[T]): T = list match {
    case x :: y :: Nil => x
    case _ :: xs => penultimate(xs)
    case _ :: Nil => throw new Exception("Penultimate")
    case _ => throw new Exception("Penultimate")
  }
  penultimate(List(1, 1, 2, 3, 5, 8))
}