package fundamentos.operadores

fun main() {
    var a: Int = 7
    var b: Int = 3

    b += a // b = b + a
    println("Resultado $b")
    b -= 4 // b = b - 4
    println("Resultado $b")
    b *= 2 // b = b * 2
    println("Resultado $b")
    b /= 2 // b = b / 2
    println("Resultado $b")
    b %= 2

    println("Resultado $b")
}