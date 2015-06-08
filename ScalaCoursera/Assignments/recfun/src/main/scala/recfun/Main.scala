package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
    println("Balanced Parens")
    val string = "I told him (that it’s not (yet) done). (But he wasn’t listening)"
    val list_of_strings = string.toList
    val bad_string = "())(".toList
    println(balance(list_of_strings))

    println("Making Change")
    val integer = 4
    val coins = List(1, 2)
    println(countChange(integer, coins))
    
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if ((c == 0 && r == 0) || (c == r) || (c == 0)) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    val strings = chars.map(x => x.toString)
    val parens = strings.filter(x => List("(", ")") contains x)

    def balance_helper(chars: List[String], queue: List[String]): Boolean = {
      if (queue.isEmpty && chars.isEmpty) true
      else {
        if (chars.head == "(") {    
          val new_queue = chars.head :: queue
          balance_helper(chars.tail, new_queue)
        }
        else {
          if (queue.isEmpty) false
          else {
            if (queue.head != "(") false
            else balance_helper(chars.tail, queue.tail)
          }
        }
      }
    }
    balance_helper(parens.tail, List(parens.head))
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {

    if (money == 0) 1
    else {
      if (coins.isEmpty || money < 0) 0
      else {
        countChange(money, coins.tail) + countChange(money - coins.head, coins)
      }
    }
  }
}
