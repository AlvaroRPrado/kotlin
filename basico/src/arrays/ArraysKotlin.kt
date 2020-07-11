package arrays

fun main(args: Array<String>){
    var array = arrayOf("SP", "GO", "PR")
    array[0] = "GO"
    array[1] = "SP"

    println(array[1])

    var mix = arrayOf("SP", 29, "RJ", 50)

    for (mix in  mix)
        println("misturado: $mix")

    var inteiros = intArrayOf(10, 13, 50, 27)

    for (inteiros in  inteiros)
        println("inteiros: $inteiros ")

    for ((index, inteiros) in  inteiros.withIndex()) {
        println("Index $index - inteiros: $inteiros ")
    }

    var outrosEstados = arrayOf("PA", "BA", "SC")

    var todosEstados = array + outrosEstados

    for (estado in todosEstados) {
        println("Estado $estado")
    }

    var str = "Uma stringo e um array"
    println(str[4])

}