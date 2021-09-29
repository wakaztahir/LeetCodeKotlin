package backspacecompare

/**
 * It takes a string that contains '#' characters that count as backspaces
 * \LeetCode https://leetcode.com/problems/backspace-string-compare/
 * @param s first string
 * @param t second string
 * @return whether string s and t are equal if they are typed out (backspaces processed)
 */
fun backspaceCompare(s: String, t: String): Boolean {
    var first = ""
    var second = ""
    var firstEnd = s.length - 1
    var backCount = 0
    while(firstEnd > -1){
        if(s[firstEnd]=='#'){
            backCount++
        }else{
            if(backCount>0){
                backCount--
            }else{
                first = s[firstEnd] + first
            }
        }
        firstEnd--
    }
    var secondEnd = t.length - 1
    backCount = 0
    while(secondEnd > -1){
        if(t[secondEnd]=='#'){
            backCount++
        }else{
            if(backCount>0){
                backCount--
            }else{
                second = t[secondEnd] + second
            }
        }
        secondEnd--
    }
    return first==second
}