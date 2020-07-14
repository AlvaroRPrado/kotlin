package heranca

open class Veiculo(open var cor: String, open var  ano: Int, open var modelo: String){
    init {
        println("Criando modelo...")
    }
    fun acelerar(){
        println("Acelerando o $modelo")
    }
}
class Carro(override var cor: String, override var ano: Int, override var modelo: String):Veiculo(cor, ano, modelo){

    fun abrindoPorta (){
        println("Porta aberta")
        
    }

}

class Caminhao(override var cor: String, override var ano: Int, override var modelo: String, var capacidaCarga: Long): Veiculo(cor, ano, modelo){

}

fun main() {
    val uno = Carro("Amarelo", 2020,"Uno")

    println("Uno: Cor ${uno.cor}, Ano ${uno.ano}, Modelo ${uno.modelo}")
    uno.abrindoPorta()
    uno.acelerar()

    val scania = Caminhao("Azul", 2020, "CS2000", 30000)
    println("Scania: Cor ${scania.cor}, Ano ${scania.ano}, Modelo ${scania.modelo}, capaciade de carga to: ${scania.capacidaCarga}")
    scania.acelerar()


}