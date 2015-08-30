package week04

/**
 * Created by reillydj on 8/29/15.
 */
// Peano Numbers
abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat = new Succ(this)
  def + (that: Nat): Nat
  def - (that: Nat): Nat
//  def toString: String
}

object Zero extends Nat {

  def isZero = true
  def predecessor = throw new Error("No natural numbers less than 0.")
  def + (that: Nat) = that
  def - (that: Nat) = {
    if (that.isZero) that
    else throw new Error("No natural numbers less than 0.")
  }

}

class Succ(n: Nat) extends Nat {
  def isZero: Boolean = false
  def predecessor = n
  def + (that: Nat) = new Succ(n + that)
  def - (that: Nat) = {
    if (that.isZero) this
    else n - that.predecessor
  }
}