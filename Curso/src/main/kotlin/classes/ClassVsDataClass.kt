package classes

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val polegadas: Int)

fun main() {
    val g1 = Geladeira("Brastemp", 320)
    val g2 = Geladeira("Brastemp", 320)
    println(g1 == g2)
    println(g1 === g2)
    println()

    val tv1 = Televisao("Samsung", 32)
    val tv2 = Televisao("Samsung", 32)
    println(tv1 == tv2)
    println(tv1 === tv2)
    println(tv1.toString())
    println(tv1.copy())
    println(tv1.copy(polegadas = 50))

    //Destructuring
    val (marca, pol) = tv1
    println("$marca, $pol")
}