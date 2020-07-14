package inteface

interface Dirigivel {
    fun acelerar(velocidade: Long)
}

interface Carregavel {
    fun carregar(quantidade: Int)
}
open class Veiculo(open var cor: String, open var  ano: Int, open var modelo: String){

}
class Carro(override var cor: String, override var ano: Int, override var modelo: String):
        Veiculo(cor, ano, modelo), Dirigivel{



    fun abrindoPorta (){
        println("Porta aberta")

    }

    override fun acelerar(velocidade: Long) {
       println("Acelerando $modelo, a $velocidade km/h")
    }

}

class Caminhao(override var cor: String, override var ano: Int, override var modelo: String,
               var capacidaCarga: Long): Veiculo(cor, ano, modelo), Dirigivel, Carregavel{

    override fun acelerar(velocidade: Long) {
        println("Acelerando $modelo, a $velocidade km/h")

    }

    override fun carregar(quantidade: Int) {
        println("Carregar caminhão com $quantidade toneladas")

    }

}

fun main() {
    val uno: Dirigivel = Carro("Amarelo", 2020,"Uno")

   // println("Uno: Cor ${uno.cor}, Ano ${uno.ano}, Modelo ${uno.modelo}")
   // uno.abrindoPorta()
    uno.acelerar(120)

    val scania: Carregavel = Caminhao("Azul", 2020, "CS2000", 30000)
   // println("Scania: Cor ${scania.cor}, Ano ${scania.ano}, Modelo ${scania.modelo}, " +
        //    "capaciade de carga to: ${scania.capacidaCarga}")
   // scania.acelerar(90)
    scania.carregar(20)


}