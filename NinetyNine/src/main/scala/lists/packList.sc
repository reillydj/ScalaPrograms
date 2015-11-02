object packList {

  def packList[T](list: List[T]): List[List[T]] = {
    list.foldLeft(List[List[T]]())( (r, c) => r match {
        case Nil => List(c) :: r
        case x :: xs =>
          if (x contains c) (c :: x) :: xs
          else              List(c) :: r
      }).reverse
  }

  packList(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
}