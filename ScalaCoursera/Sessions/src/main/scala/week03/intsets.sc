import week03.{NonEmpty, IntSet, Empty}
object intsets {
  val t1 = new NonEmpty(3, Empty, Empty)
  val t2 = t1 incl 4

  val t3 = t1 union t2
  val t4 = t3 union new NonEmpty(5, Empty, Empty)
}