package fundamentos

fun main() {
    val a = 2
    //Número pra string
    println(a.toString() +1)
    println("2.3".toDouble() +4)
    println("teste".toIntOrNull())
    println("Teste".toIntOrNull() ?: 0)
    println("5".toInt() +3)

}