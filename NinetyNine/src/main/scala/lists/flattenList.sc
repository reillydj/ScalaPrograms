object flattenList {

  def flattenList(list: List[Any]): List[Any] = list flatMap {
    case ls: List[_] => flattenList(ls)
    case el => List(el)
  }
  flattenList(List(List(1, 1), 2, List(3, List(5, 8))))
}