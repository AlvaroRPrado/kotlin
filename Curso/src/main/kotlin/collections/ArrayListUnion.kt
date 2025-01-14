package collections

fun main() {
    val numeros = arrayListOf(1, 2, 3, 4, 5)
    val strings = arrayListOf("Rafael", "Pedro", "Priscila", "Alvaro")
    val uniao = numeros + strings

    for (item in uniao) {
        println(item)
    }
}