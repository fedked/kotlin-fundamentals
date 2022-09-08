package fundamentos

fun main() {
    var lista = listOf(1, 2, 3, 4, 6)
//    val pares = lista.filter { it % 2 == 0}.first()
//    val pares = lista.last()
//    lista.forEach {
//        println(it)
//    }
    for (numero in lista) {
        println(numero)
    }

    println(lista[0])
    println("---------")
    println(lista.get(0))
    println("---------")
    println(lista.size)
    println("---------")
    println(lista.indexOf(6))
}