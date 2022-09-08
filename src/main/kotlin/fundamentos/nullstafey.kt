package fundamentos

fun main() {
    var nome: String? = null
    var tamanho: Int = nome?.length ?: 0
    println(tamanho)

    var lista : List<Int?> = listOf(1, 2, null, 4)
    var listaNumber : List<Int>? = null

//    var nome: String? = "Fulank"
//
//    if(nome != null) {
//        println(nome.length)
//    }
//
//    val toShort: Short = nome!!.length?.toShort()

}