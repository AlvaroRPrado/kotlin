package collections

fun main() {
    val map = hashMapOf(1 to "Gui", 2 to "Rebeca", 3 to "Cibalena")

    for ((id, name) in map){
        println("$id: $name")
    }
    println()
    map.forEach{
        println(it.value)
    }
}