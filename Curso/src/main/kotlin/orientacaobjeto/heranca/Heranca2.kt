package orientacaobjeto.heranca

open class Animal(val name: String)

class Cachorro : Animal{
    private val altura: Double
    private val idade : Int
    constructor(name: String, altura: Double, idade: Int) : super(name){
        this.altura = altura
        this.idade = idade
    }
    constructor(name: String): this(name = name, 10.0, 2)


    override fun toString(): String  = "$name tem $altura cm de altura e idade de $idade de anos"
}

fun main() {
    val dogAlemao = Cachorro(name = "Spyke", altura = 84.0, idade = 4)
    val vorkshire = Cachorro("Lady Di")

    println(dogAlemao)
    println(vorkshire)
}