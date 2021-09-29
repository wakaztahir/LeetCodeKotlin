package rainwater

/**
 * \LeetCode https://leetcode.com/problems/trapping-rain-water/
 * @param height's
 * @return rain water that can be trapped
 */
fun trap(height: IntArray): Int {
    var start = 0
    var end = height.size - 1
    var total = 0
    var maxL = 0
    var maxR = 0
    while (start < end) {
        if (height[start] < height[end]) {
            if (height[start] > maxL) {
                maxL = height[start]
            } else {
                total += maxL - height[start]
            }
            start++
        } else {
            if (height[end] > maxR) {
                maxR = height[end]
            } else {
                total += maxR - height[end]
            }
            end--
        }
    }
    return total
}