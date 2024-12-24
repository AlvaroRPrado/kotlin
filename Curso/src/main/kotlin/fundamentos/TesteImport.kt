package fundamentos

import fundamentos.pacoteA.SimpleFuncao as funcaoSimples
import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.FaceMoeda.CARA
import fundamentos.pacoteB.*

fun main() {
    kotlin.io.println(funcaoSimples("Olá"))

    val coisa = Coisa("Bola")
    println(coisa.name)
    println(CARA)

    println(soma(35, 43))
    println(subtracao(34, 98))
}