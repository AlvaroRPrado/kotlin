package orientacaobjeto.polimorfismo

class Feijao(val peso: Double)
class Arroz(val peso: Double)

class Pessoa(var peso: Double){
    fun comer(feijao: Feijao){
        peso += feijao.peso
    }
    fun comer(arroz: Arroz){
        peso += arroz.peso
    }
}

fun main() {
    val feijao = Feijao(0.5)
    val arroz = Arroz(0.5)
    val joao = Pessoa(80.4)
    joao.comer(feijao)
    joao.comer(arroz)
    println(joao.peso)
}
