package fundamentos

fun main() {
//    printa1a10()
//    printa10a1()
//    printaPar1a10()
//    printaRange()
//    printaRange2(10, 20)
//    whileMenorQue10()
    doWhileMenorQue10()
}

//fun whileMenorQue10() {
//    var x = 10
//    while(x >= 0) {
//        println(x)
//        x--
//    }
//}

fun doWhileMenorQue10() {
    var x = 10
    do {
        println(x)
    } while (x < 10)
}

fun printa1a10() {
    for(numero in 1..10) {
        println(numero)
    }
}

fun printa10a1() {
    for (numero in 10 downTo 1) {
        println(numero)
    }
}

fun printaPar1a10() {
    for (numero in 2 .. 10 step 2) {
        println(numero)
    }
}

fun printaRange() {
    for (numero in 10 .. 20) {
        print("${numero} ")
    }
}

fun printaRange2(inicio: Int, fim: Int) {
    for (numero in inicio .. fim) {
        print("\n${numero} ")
    }
}