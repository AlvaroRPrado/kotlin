package classes

class Filme{
    val name: String
    val anoLancamento: Int
    val genero: String
    constructor(name: String, anoLancamento: Int, genero: String){
        this.name = name
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main() {
    val filme = Filme(name = "Poderoso chefão", anoLancamento = 1972, genero = "Drama")
    println("Genero:${filme.genero}, ${filme.name} foi lançado em ${filme.anoLancamento}")
    println()
}