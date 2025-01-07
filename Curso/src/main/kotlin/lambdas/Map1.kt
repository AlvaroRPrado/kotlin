package lambdas

import java.util.*

fun main() {
    val alunos = arrayListOf("pedro", "tiago", "hugo", "Talita")
    alunos.map { it.uppercase(Locale.getDefault()) }.apply { println(this) }
}