package collections

fun main() {
    val numeros = Array<Int>(10) {i -> i * 10 }

    for (numero in numeros){
        println(numero)
    }
    println(numeros.get(1))//pegando uma posição do array
    println(numeros[1])
    println(numeros.size)// verificando o tamanho do array
    numeros.set(1, 1234) // alterando o valor da posição
    println(numeros[1])
}