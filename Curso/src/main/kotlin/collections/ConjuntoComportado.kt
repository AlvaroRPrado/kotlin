package collections

fun main() {
    val aprovados = hashSetOf("Maria", "Priscila", "Pedro", "Ana", "Joana")
    //aprovados.add(2)

    println("Sem ordem...")
    for (aprovado in aprovados)aprovado.print()

    val aprovadosNaOrdem1 = linkedSetOf("Maria", "Priscila", "Pedro", "Ana", "Joana")
    println()
    println("Linked...")
    for (aprovado in aprovadosNaOrdem1)aprovado.print()

    val aprovadosNaOrdem2 = sortedSetOf("Maria", "Priscila", "Pedro", "Ana", "Joana")
    println()
    println("Sorted...")
    for (aprovado in aprovadosNaOrdem2)aprovado.print()

    //Ordem maluca
    println()
    aprovados.sortedBy { it.substring(1) }.print()
}
