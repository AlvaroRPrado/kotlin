package ColectionSet
//O setcollection não aceita elemento repetido , e não mantem ordem de escrita
fun main() {
    var set = hashSetOf(2, 1, 44, 200, 1)
    set.add(300)

    for (item in set){
        println(item)
    }
    set.remove(44)

    for (item in set){
        println(item)
    }


}