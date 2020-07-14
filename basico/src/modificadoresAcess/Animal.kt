package modificadoresAcess

open class Animal {
    private var nome = "Marie"
    protected var ano = 2014
    internal var tipo = "Mamifero"
    var patas = 4
}

class Cachorro: Animal() {

    fun descobrirIdade() {
        println("A idade é " + (2020 - ano))
    }
}

fun main(args: Array<String>) {
    val marie = Cachorro()

    marie.descobrirIdade()
    println(marie.tipo)
    println(marie.patas)
}