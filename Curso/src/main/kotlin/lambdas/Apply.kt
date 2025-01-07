package lambdas

class Calculadora2{
    var result = 0

    fun soma(valor1: Int, valor2: Int){
        result += valor1 + valor2
    }
    fun add(valor: Int){
        result += valor
    }
}

fun main() {
    val calculadora  = Calculadora2()

    calculadora.apply { soma(4, 5) }.apply { add(5) }.apply { println(result) }

    calculadora.apply {
        soma(4, 5)
        add(5)
        println(result)
    }

    // inline function
    with(calculadora){
        soma(4, 5)
        add(5)
        println(result)

    }
}