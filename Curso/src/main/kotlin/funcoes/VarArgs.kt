package funcoes

fun ordenar(vararg numeros: Int, a: Int): IntArray{
    println(a)
    return numeros.sortedArray()
}
fun main() {
    for (numero in ordenar(22, 21, 76, 332, 3, 84, 0, 34567, a = 1)){
        println("$numero")
    }
}