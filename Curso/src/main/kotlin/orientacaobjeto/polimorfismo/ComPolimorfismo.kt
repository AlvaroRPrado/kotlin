package orientacaobjeto.polimorfismo
open class Comida(val peso: Double)
class Feijao2(peso: Double) : Comida(peso)
class Arroz2(peso: Double) : Comida(peso)
class Ovo(peso: Double) : Comida(peso)

class Pessoa2(var peso: Double){
    fun comer(comida: Comida) {
        peso += comida.peso
    }
}

fun main() {
    val feijao = Feijao2(0.5)
    val arroz = Arroz2(0.5)
    val ovo = Ovo(0.7)
    val joao = Pessoa2(80.0)
    joao.comer(feijao)
    joao.comer(arroz)
    joao.comer(ovo)
    println(joao.peso)
}