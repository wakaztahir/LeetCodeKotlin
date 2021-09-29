package nonrepeatingsubstring

/*
* \LeetCode https://leetcode.com/problems/longest-substring-without-repeating-characters/
* @param s string you want to find substring in
* @return length of longest non repeating substring
*/
fun lengthOfLongestSubstring(s: String): Int {
    val seen = HashMap<Char, Int>()
    var longest = 0
    var start = 0
    s.forEachIndexed { index, char ->
        if (seen[char] != null) {
            if (seen[char]!! >= start) {
                start = seen[char]!! + 1
            }
        }
        seen[char] = index
        longest = maxOf(longest, index - start + 1)
    }
    return longest
}