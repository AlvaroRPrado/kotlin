package lambdas

fun main() {
    val listWitNulls: List<String?> = listOf("A", null, "B", null, null, "C", null)

    for (item in listWitNulls){
        item?.let {
            println(it)
        }
    }
}