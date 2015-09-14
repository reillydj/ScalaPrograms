
// Reverse a list.

object reverse {
  def reverse[T](list: List[T]): List[T] = {
    list.foldRight(List[T]())((x, y) => y ::: List(x))
  }
  reverse(List(0, 1, 2))
}