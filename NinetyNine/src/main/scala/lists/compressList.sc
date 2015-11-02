object compressList {

  def compressList[T](list: List[T]): List[T] = {
    list.foldLeft(List[T]())( (r, c) => r match {
      case Nil => c :: r
      case x :: xs =>
        if (x == c) c :: xs
        else        c :: r
    }).reverse
  }

  compressList(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))

}