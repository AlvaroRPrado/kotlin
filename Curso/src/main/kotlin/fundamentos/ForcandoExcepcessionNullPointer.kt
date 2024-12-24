package fundamentos

fun main() {
    val a: Int? = null
    println(a?.inc())
    println()
    println("Momento do erro ...")
    println(a!!.inc())//erro forçado
}