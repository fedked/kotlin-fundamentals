package exemplos

class Aviao(var marca: String, var modelo: String, var pais: String, var aviao2: outroAviao) {
    override fun toString(): String {
        return "Classe Aviao. Marca: ${marca}, Modelo: ${modelo}, país: ${pais}"
    }
}
data class outroAviao(var marca: String, var modelo: String)

fun main() {
    var aviao = Aviao("Airbus", "A380", "França", outroAviao("Airbnb", "350"))
    println(aviao)
    println(aviao.aviao2)
}