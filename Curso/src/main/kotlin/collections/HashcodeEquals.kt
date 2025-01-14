package collections

import java.util.function.Consumer

class Objeto(val name: String, val descricao: String){
    override fun hashCode(): Int {
        return name.length
    }

    override fun equals(other: Any?): Boolean {
        return if (other is Objeto){
            name.equals(other.name, ignoreCase = true)
        }else{
            false
        }
    }
}

fun main() {
    val conjunto = hashSetOf(
        Objeto("Cadeira", "...."),
        Objeto("Mesa", "...."), //hashacode =4
        Objeto("Faca", "lll"),
        Objeto("Copo", "....")
    )
    conjunto.contains(Objeto("faca", "All")).print()
}