package funcoes

fun pontencia(base: Int = 2, expoente: Int = 1): Int{
    return Math.pow(base.toDouble(), expoente.toDouble()).toInt()
}
fun main() {
    println(pontencia(3,2))
    println(pontencia(10))
    println(pontencia(base = 10))
    println(pontencia(expoente = 3))
}