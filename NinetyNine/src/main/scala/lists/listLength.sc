
// Find the number of elements of a list.

object listLength {
  def listLength[T](list: List[T]): Int = {
    def helper[T](n: Int, list: List[T]): Int = list match {
      case Nil => n
      case _ :: xs => helper(n + 1, xs)
    }
    helper(0, list)
  }
  listLength(List(1, 1, 2, 3, 5, 8))
}