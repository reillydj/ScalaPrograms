object test {

  val xs = Array(1, 2, 3, 44)

  val s = "Hello World!"
  s filter (c => c.isUpper)

  val pairs = List(1, 2, 3) zip s
  pairs.unzip

  s flatMap (c => List('.', c))


  1 to 10 flatMap (x => 20 to 30 map (y => List(x, y)))

  def isPrime(n: Int): Boolean =
    !(2 until n exists (n % _ == 0))

  isPrime(2)
  isPrime(3)
  isPrime(4)
  isPrime(100)

}