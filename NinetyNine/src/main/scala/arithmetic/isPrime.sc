object isPrime {
  def isPrime(n: Int): Boolean = {

    if (n == 1) true
    else {
      var start = 2
      while (start <= (n / 2.0).toInt) {
        if (n % start == 0) false
        else start += 1
      }
      true
    }
  }

  def sieve(s: Stream[Int]): Stream[Int] =
    s.head #:: sieve(s.tail filter (_ % s.head != 0))

  def from(n: Int): Stream[Int] =
    n #:: from(n + 1)

  (sieve(from(2)) take 100).toList
}