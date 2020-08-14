package Enum

enum class Direcao {
    NORTE, SUL, LESTE, OESTE
}

class  Bussola {
    var direcao: Direcao = Direcao.LESTE
    var direcao2: Direcao = Direcao.NORTE

}

fun main() {
    val  bussola = Bussola()
    val bussola2 = Bussola()

    println(bussola.direcao)
    println(bussola2.direcao2)
}