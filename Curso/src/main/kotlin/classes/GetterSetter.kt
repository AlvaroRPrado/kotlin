package classes

class Cliente2{
    constructor(nome: String){
        this.nome = nome
    }
    var nome: String
        get() = "Meu nome é ${field}"
        set(value){
            field = value.takeIf { value.isNotEmpty() } ?: "Anônimo"
        }

}

fun main() {
    val cliente1 = Cliente2("")
    println(cliente1.nome)
    println()
    val cliente2 = Cliente2("Alvaro")
    println(cliente2.nome)
}