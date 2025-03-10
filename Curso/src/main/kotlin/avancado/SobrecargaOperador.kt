package avancado

data class Ponto(val x: Int, val y: Int){
    operator fun plus(other: Ponto): Ponto = Ponto(x = x + other.x, y = y + other.y)
    operator fun unaryMinus(): Ponto = Ponto(-x, -y)
}

fun main() {
    val ponto1 = Ponto(x = 10, y = 20)
    val ponto2 = Ponto(10 , 20)

    println(-ponto1)
    println(ponto1 + ponto2)
}