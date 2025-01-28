package avancado

import java.lang.IllegalArgumentException

fun factorial(num: Int): Int = when(num){
    in 0..1 -> 1
    in 2..Int.MAX_VALUE -> num * factorial(num - 1)
    else -> throw IllegalArgumentException("Números invalidos")
}
fun main() {
    println("Resultado ${factorial(6)}")
}