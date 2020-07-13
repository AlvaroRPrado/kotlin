package construtores


class CarroC (var cor: String, var ano: Int, var modelo: String ){//iniciando o construtores

    /*var cor: String
    var ano: Int
    var modelo: String
     init {
         this.cor = cor
         this.ano = ano
         this.modelo = modelo
     }*/
    init {
        println("Criando carro...")
    }
    fun acelerar(){
        println("Acelerando o $modelo")
    }
}

fun main() {
    val uno = CarroC("Amarelo", 2020,"Cros")

    println("Uno: Cor ${uno.cor}, Ano ${uno.ano}, Modelo ${uno.modelo}")
    uno.acelerar()

    val mercedes = CarroC("Preta", 2020, "CS2000")
    println("Mercedes: Cor ${mercedes.cor}, Ano ${mercedes.ano}, Modelo ${mercedes.modelo}")
    mercedes.acelerar()


}