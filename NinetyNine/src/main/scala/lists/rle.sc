object rle {

  def packList[T](list: List[T]): List[List[T]] = {
    list.foldLeft(List[List[T]]())( (r, c) => r match {
      case Nil => List(c) :: r
      case x :: xs =>
        if (x contains c) (c :: x) :: xs
        else              List(c) :: r
    }).reverse
  }

  def encode[T](lst: List[T]): List[(Int, T)] = {
    val packed = packList(lst)
    packed map (x => (x.length, x.head))
  }
  assert(encode(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')) == List((4,'a'), (1,'b'), (2,'c'), (2,'a'), (1,'d'), (4,'e')))
}