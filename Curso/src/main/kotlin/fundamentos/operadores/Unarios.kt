package fundamentos.operadores

fun main() {
    var number1 = 1
    var number2 = 2

    number1++
    println(number1)
    --number1
    println(number1)

    //Incremento e decremento
    println(++number1 == number2--)
    println(number1 == number2)
}