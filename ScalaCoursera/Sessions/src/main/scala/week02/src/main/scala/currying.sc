object currying {
//  def product(f: Int => Int)(a: Int, b: Int): Int =
//      if (a > b) 1
//      else f(a) * product(f)(a + 1, b)
//  product(x => x * x)(1, 3)

//  def fact(n: Int) = product(x => x)(1, n)
//  fact(5)

  def accum(f: Int => Int, opp: (Int, Int) => Int, base: Int)(a: Int, b: Int): Int =
    if (a > b) base
    else opp(f(a), accum(f, opp, base)(a + 1, b))
  accum(x => x * x, (x, y) => x * y, 1)(1, 3)

  def product(f: Int => Int)(a: Int, b: Int): Int =
    accum(f, (x, y) => x * y, 1)(a, b)
  
  product(x => x * x)(1, 3)
}
