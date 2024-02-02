class GcdOfStrings {
    fun gcdOfStrings(str1: String, str2: String): String{
        //Check if gcd exists
        if(str1 + str2 != str2+ str1){
            return ""
        }
        var l1 = str1.length
        var l2 = str2.length

        //Find the GCD of two strings
        while(l1!=l2){
            if(l1>l2) {
                l1-=l2
            }else{
                l2-=l1
            }
        }
        return str1.substring(0,l1)
    }
}

fun main() {
    val gcd = GcdOfStrings()
    println( gcd.gcdOfStrings("ABABAB","ABAB"))
}