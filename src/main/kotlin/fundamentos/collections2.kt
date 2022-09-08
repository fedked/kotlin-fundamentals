package fundamentos

fun main() {
    var mapNomeIdade = mutableMapOf("Fernando" to 28, "Kendi" to 20)
    println(mapNomeIdade)

    mapNomeIdade["Bruno"] = 30
    println(mapNomeIdade)

    mapNomeIdade.remove("Bruno")
    println(mapNomeIdade)

    mapNomeIdade.putIfAbsent("Bruno", 30)
    println(mapNomeIdade)



//    var lista = mutableListOf(1, 2, 3, 4)
//    println("Lista: $lista")
//
//    var setNumeros = setOf(1,2,3,2)
//    println(setNumeros.contains(4))

//    println(lista)
//
//    lista.add(8)
//
//    lista.removeAt(0)
//    println(lista)

//    var listaNomes = mutableListOf("Nando", "Kendiz")
//    println(listaNomes)
//
//    listaNomes.sort()
//    println(listaNomes)
}