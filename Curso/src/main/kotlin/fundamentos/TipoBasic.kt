package fundamentos

fun main() {
    //Tipos numericos inteiros são 4

    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = Int.MAX_VALUE
    val num4: Long = 9_223_372_036_854_775_807

    //Tipos numericos reais
    val num5: Float = 3.14F
    val num6: Double = 3.14

    //Tipos Caractere
    val char: Char = '?' //outros exemplos... '1', 'd', 'f'

    //Tipo booleano
    val boolean: Boolean = true// ou false

    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean))
    println(2 is Int)
    println(21474636489 is Long)
    println(2.3 is Double)

    //No kotlin tudo é objeto
    println(10.dec())
}