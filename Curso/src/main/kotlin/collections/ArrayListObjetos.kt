package collections

data class Fruta(var nome: String, var preco: Double)

fun main() {
    var frutas = arrayListOf(Fruta(nome = "Banana", preco = 1.50), Fruta("Morango", 3.29))

    for (fruta in frutas) println("${fruta.nome} - R$ ${fruta.preco}")

    println(frutas.contains(Fruta(nome = "Banana", preco = 1.50)))
    println(frutas.distinctBy { it.preco })
}