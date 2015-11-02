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

//  isPrime(8)
}