package week04

import java.util.NoSuchElementException

/**
 * Created by reillydj on 8/28/15.
 */
trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
//  def nth[T](n: Int, xs: List[T]): T
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty: Boolean = false
//  def nth: Nothing = throw new scala.IndexOutOfBoundsException("Nil.nth")
}

class Nil[T] extends List[T] {
  def isEmpty: Boolean = true
  def head: Nothing = throw new scala.NoSuchElementException("Nil.head")
  def tail: Nothing = throw new scala.NoSuchElementException("Nil.tail")
//  def nth[T](n: Int, xs: List[T]): T = {
//    if (n == 0) xs.head
//    else nth(n - 1, xs.tail)
//  }
}