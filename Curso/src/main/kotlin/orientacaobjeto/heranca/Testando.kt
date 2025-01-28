package orientacaobjeto.heranca

fun main() {
    val carro = Ferrari()
    carro.acelerar()
    println(carro)

    carro.ligarTurbo()
    carro.acelerar()
    println(carro)
    carro.frear()
    println(carro)
}