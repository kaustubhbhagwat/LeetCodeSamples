class CanPlantFLowers {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var plots = n
        var i = 0
        while (i < flowerbed.size && plots > 0) {
            if (flowerbed[i] == 0 && (i - 1 < 0 || flowerbed[i - 1] == 0)
                && (i + 1 >= flowerbed.size || flowerbed[i + 1] == 0)) {
                plots--
                flowerbed[i] = 1
                i++
            }
            i++
        }
        return plots == 0
    }
}

fun main() {
    val canPlantFLowers = CanPlantFLowers()
    canPlantFLowers.canPlaceFlowers(intArrayOf(1,0,0,0,1),1)
}