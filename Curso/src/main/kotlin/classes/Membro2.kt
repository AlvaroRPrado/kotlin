package classes

class Calculadora{
    private var resultado: Int = 0
    fun somar(vararg valores: Int): Calculadora{
        valores.forEach { resultado += it }
        return this
    }
    fun multiplicar(valor: Int): Calculadora{
        resultado *= valor
        return this
    }
    fun subtrair(vararg valores: Int): Calculadora{
        valores.forEach { resultado -= it }
        return this
    }
    fun dividir(valor: Int): Calculadora{
        resultado /= valor
        return this
    }
    fun limpar(): Calculadora{
        resultado = 0
        return this
    }
    fun print(): Calculadora{
        println(resultado)
        return this
    }
    fun obterResultado(): Int{
        return resultado
    }
}

fun main() {
    val  calculadora = Calculadora()
    calculadora.somar(2, 4, 8).somar().print()
    calculadora.dividir( 2).print()
    calculadora.multiplicar(3).dividir(3).print()
    calculadora.subtrair(3, 3, 2).subtrair().print()
    println(calculadora.obterResultado())
    calculadora.limpar()
    println(calculadora.obterResultado())
}