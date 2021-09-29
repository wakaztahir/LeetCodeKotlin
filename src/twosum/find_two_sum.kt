package twosum

/**
 * It finds indices of two numbers in the  [numbers] that sum to [target]
 * https://leetcode.com/problems/two-sum/
 * @param nums : [IntArray] of numbers
 * @param target : target | the sum of two numbers to search
 * @return [IntArray] containing the indices of two numbers
 */
fun findTwoSum(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int,Int>();
    nums.forEachIndexed { index, num ->
        val numToFind = target - num;
        if(map[numToFind]!=null){
            return IntArray(2).apply {
                set(0,index)
                set(1,map[numToFind]!!)
            }
        }else{
            map[num] = index
        }
    }
    return IntArray(2).apply {
        set(0,-1)
        set(1,-1)
    }
}