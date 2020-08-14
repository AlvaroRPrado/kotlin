package execoes

import java.lang.Exception

fun main() {
    try {
        println("digite um numero")
        val numero: Int = readLine()!!.toInt()
        val  divisao: Int = 100 / numero

        println("A divisão e $divisao")

    }catch (e: Exception){
        println("Erro: ${e.message}")
    }finally {
        println("Programa finalizado")
    }
}