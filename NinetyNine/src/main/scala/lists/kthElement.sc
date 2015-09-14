

// Find the kth element of a list
object kthElement {

  def kthElement[T](k: Int, list: List[T]): T = {
    def iterate[T](iter: Int, list: List[T]): T = {
      if (iter == k) list.head
      else iterate(iter + 1, list.tail)
    }
    if (k >= list.length) throw new IndexOutOfBoundsException
    else iterate(0, list)
  }
  kthElement(0, List(1, 1, 2, 3, 5, 8))
}