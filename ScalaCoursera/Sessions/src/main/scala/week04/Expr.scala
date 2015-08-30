package week04

/**
 * Created by reillydj on 8/29/15.
 */
trait Expr {
  def eval(e: Expr): Int = e match {
    case Number(n) => n
    case Sum(e1, e2) => eval(e1) + eval(e2)
  }
//  def show(e: Expr): String = e match {
//    case Number(n) => n.toString
//    case Sum(e1, e2) => show(e1) + " + " + show(e2)
//  }
}

case class Number(n: Int) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr
