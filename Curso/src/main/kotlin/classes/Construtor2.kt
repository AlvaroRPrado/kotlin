package classes

class Filme2(val name: String, val anoLancamento: Int, val genero: String)

fun main() {
    val filme = Filme2(name = "Monstro S.A", anoLancamento = 2001, genero = "comedia")
    println("Genero ${filme.genero}, ${filme.name} foi lançado em ${filme.anoLancamento}")
}