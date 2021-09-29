package containermostwater

/**
 * https://leetcode.com/problems/container-with-most-water/
 * @param height is the heights of lines
 * @return int max area that two lines can hold
 */
fun maxArea(height: IntArray): Int {
    var maxArea = 0
    var start = 0
    var end = height.size - 1
    while(start < end){
        val width = end - start
        val len = minOf(height[start],height[end])
        maxArea = maxOf(maxArea,width * len)
        if(height[start]<height[end]){
            start++
        }else{
            end--
        }
    }
    return maxArea
}