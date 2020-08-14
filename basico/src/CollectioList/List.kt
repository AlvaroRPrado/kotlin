package CollectioList

fun main() {
    var array = arrayListOf("Alvaro", "Maria", "Dim")
    array.add("Jakelline")

    println("Resultado: $array")
    println(array.size)

    array.remove("Maria")

    println("Resultado depois: $array")

    println(array.size)
    println(array.isEmpty())
    println(array.contains("Jakelline"))

    for (nome in array) {
        println(nome)
    }
}



