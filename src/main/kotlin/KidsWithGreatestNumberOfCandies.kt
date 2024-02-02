
/* There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.*/
class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        var kidsWithCandiesList : MutableList<Boolean> = mutableListOf()
        var max = 0
        for (i in candies){
            max = maxOf(i,max)
        }
        for (i in candies){
            kidsWithCandiesList.add(i + extraCandies >= max)
        }
        return kidsWithCandiesList
    }
}

fun main() {
    val solution = Solution()
    val kidsWithCandiesArray = intArrayOf(2,3,5,1,3)
    println(solution.kidsWithCandies(kidsWithCandiesArray,3))
}