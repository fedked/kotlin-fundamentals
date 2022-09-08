package exemplos.Roupa

class Roupa(var categoria: String, var tamanho: String, var tecido: String, var cor: String, var tenis: Tenis) {
    override fun toString(): String {
        return "Tenho a minha ${categoria} é ${cor}, tem tamanho: ${tamanho} e o tecído é Algodão."
    }
}
data class Tenis(var marca: String, var tamanho: Int, var cor: String)

fun main() {
    var camisa = Roupa("camisa", "M", "Algodão", "preto",
        Tenis("Nike", 42, "cinza"))
    println("${camisa}\ne o meu tenis: ${camisa.tenis}")
}