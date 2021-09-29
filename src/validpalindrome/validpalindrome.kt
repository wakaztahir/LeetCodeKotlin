package validpalindrome

/**
 * Returns true if valid palindrome , false if not
 * @param s : the string
 * @return true or false if palindrome or not
 */
fun isValidPalindrome(s: String): Boolean {
    val regex = Regex("[^A-Za-z0-9]")
    val tr = s.replace(regex, "").lowercase()
    return isPalindrome(tr, 0, tr.length)
}

/**
 * Checks if string is palindrome or if it is not
 * and it can become a palindrome by removing just one character
 * returns true otherwise false
 * @param s : the string
 * @return true or false if almost palindrome or not
 */
fun isAlmostPalindrome(s: String): Boolean {
    val regex = Regex("[^A-Za-z0-9]")
    val tr = s.replace(regex, "").lowercase()
    var start = 0
    var end = tr.length - 1
    while (start < end) {
        if (tr[start] != tr[end]) {
            return isPalindrome(tr, start + 1, end) || isPalindrome(tr, start, end - 1)
        }
        start++
        end--
    }
    return true
}

private fun isPalindrome(str: String, s: Int, e: Int): Boolean {
    var start = s
    var end = e
    while (start < end) {
        if (str[start] != str[end]) {
            return false
        }
        start++
        end--
    }
    return true
}