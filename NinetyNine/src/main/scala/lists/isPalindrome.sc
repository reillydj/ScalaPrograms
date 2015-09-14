
// Find out whether a list is a palindrome.
object isPalindrome {
  def isPalindrome[T](list: List[T]): Boolean = {
    val length = list.length
    if (length <= 1) true
    else if (list.head != list(length - 1)) false
    else isPalindrome(list.slice(1, length - 1))
  }
  isPalindrome(List(1, 2, 3, 2, 1))

  def isPalindrome2[T](list: List[T]): Boolean =
    list == list.reverse

  isPalindrome(List(1, 2, 3, 2, 1))
}