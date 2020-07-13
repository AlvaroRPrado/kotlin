package classes

class Carro {

    var cor: String = "Amarelo"
    var ano: Int = 2019
    var modelo: String = "Fox"
}

fun main() {
    val uno = Carro()
    uno.ano = 2020
    uno.modelo = "Uno"
    println(uno.ano)
    println(uno.modelo)
    println(uno.cor)

    val mercedes = Carro()
    mercedes.cor = "Preta"
    mercedes.ano = 2020
    mercedes.modelo ="CS200"
    println("Mercedes: Cor ${mercedes.cor}, Ano ${mercedes.ano}, Modelo ${mercedes.modelo}")

}