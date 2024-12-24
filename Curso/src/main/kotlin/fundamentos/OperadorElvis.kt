package fundamentos

val opcional: String? = null
val obrigatorio: String = opcional ?: "Valor padrão"

fun main() {
    println(obrigatorio)
}