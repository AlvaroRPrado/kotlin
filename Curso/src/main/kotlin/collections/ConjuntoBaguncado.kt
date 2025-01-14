package collections

fun Any.print() = println(this)

fun main() {
    val conjunto = hashSetOf(3, 'a', "texto", true, 3.14)

    conjunto.add(3).print()// resultado vai ser false pois já tem o 3. Não aceita repetição
    conjunto.add(10)//resultado vai se true

    conjunto.size.print()

    conjunto.remove("a").print()
    conjunto.remove('a').print()

    conjunto.contains('a').print()
    conjunto.contains("Texto").print()
    conjunto.contains("texto").print()

    val nuns = setOf(1, 2, 3)
    //nuns.add(4)
    (conjunto + nuns).print()
    (conjunto - nuns).print()

    conjunto.intersect(nuns).print()//Não altera o conjunto
    conjunto.retainAll(nuns)//Altera o conjunto
    conjunto.print()

    conjunto.clear()
    conjunto.isEmpty().print()




}