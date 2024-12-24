package fundamentos

fun soma(a: Int, b: Int = 5): Int{
    return a + b
}
fun main() {
    println(soma(20, 32))
    println()
    println(soma(32))
}