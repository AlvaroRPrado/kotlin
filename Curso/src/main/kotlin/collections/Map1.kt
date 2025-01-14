package collections

fun main() {
    var map = HashMap<Long, String>()

    map[10020030040] = "Alvaro"
    map.put(30040080090, "Maria")
    map.put(60070080090, "Pedro")
    map.put(key = 60070080090, value = "Pedro Filho")

    for (par in map) par.print()

    println()
    for (name in map) name.value.print()
    println()
    for (cpf in map) cpf.key.print()
    println()
    for ((cpf, name) in map){
        println("$name (CPF: $cpf)")
    }
    println()
    map.size.print()
    map.get(10020030040)?.print()
    map[10020030040]?.print()
    map.contains(10020030040).print()
    map.remove(60070080090)?.print()
    map.clear()
    map.isEmpty().print()
}