package classes

class Filme3(name: String, anoLancamento: Int, genero: String){
    val name: String
    val anoLancamento: Int
    val genero: String

    init {
        this.name = name
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main() {
    val filme = Filme3(name = "os incriveis", anoLancamento = 2004, genero = "ação")
    println("Genero ${filme.genero}, ${filme.name} foi lançado em ${filme.anoLancamento}.")

}