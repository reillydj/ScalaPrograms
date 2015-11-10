import week07.pouring

object test {

  val problem = new pouring(Vector(4, 9, 19))
  problem.moves
  problem.solutions(17).take(3).toList

}