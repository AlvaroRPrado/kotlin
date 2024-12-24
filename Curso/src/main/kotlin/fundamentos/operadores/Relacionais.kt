package fundamentos.operadores

import java.util.Date

fun main() {
    println("Banana" === "Banana")
    println(3 !== 2)
    println(3 > 2)
    println(3 <= 2)
    println(3 >=2)
    val d1 = Date(0)
    val d2 = Date(0)

    //igualdae referencial
    println("Resultado com '===' ${d1 === d2}")

    //igualdade estrutural
    println("Resultado com '==' ${d1 == d2}")
}