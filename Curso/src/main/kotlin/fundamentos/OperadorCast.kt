package fundamentos

fun imprimirConceito(nata: Any){
    when(nata as? Int){
        10, 9 -> println("A")
        8, 7 -> println("B")
        6, 5 -> println("C")
        4, 3 -> println("D")
        2, 1, 0 -> println("E")
        else -> println("Nota invalida")
    }
}
fun main() {
    val notas = arrayOf(9.6, 4.5, 7.5, 6.3, 1.9)

    for (notas in notas){
        imprimirConceito(notas.toInt())
    }
}