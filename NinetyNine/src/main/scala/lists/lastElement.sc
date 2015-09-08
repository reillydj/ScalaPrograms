
// Find the last element of a list
object lastElement {
  def last[T](list: List[T]): T = list match {
    case x :: Nil => x
    case _ :: xs => last(xs)
    case Nil => throw new Exception("Empty List.")
  }

  last(List(1, 1, 2, 3, 5, 8))
}