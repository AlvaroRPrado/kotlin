package fundamentos.operadores

data class Carro(val marca: String, val modelo: String)

fun main() {
    val (marca, modelo) = Carro("Ferrari", "Barrikele")

    println("$marca $modelo")

    val (marido, mulher) = listOf("Alvaro", "Priscila")
    println("$marido, e $mulher")

    val (_,_, terceiroLugar) = listOf("Kimi", "Haliton", "Filipe")
    println("$terceiroLugar terminou em terceiro lugar")
}