import kotlin.math.roundToInt

fun main() {
    fun round(x: Double): Double {
        var res:Double = x * 10
        res = res.roundToInt().toDouble()
        res /= 10
        return res
    }
    var x = -5.0
    var n = round(x * 100)
    println(n)
    if(round(n).toInt() % 10 == 0)
    println(n/10)
}
