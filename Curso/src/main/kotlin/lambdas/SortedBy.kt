package lambdas

fun main() {
    val nomes = arrayListOf("Renata", "Priscila", "Alvaro", "Pietro", "Caio", "Maria")
    val ordenados = nomes.sortedBy { it.reversed() }


    println(ordenados)
}
