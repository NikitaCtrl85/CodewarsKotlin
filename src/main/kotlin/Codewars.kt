import kotlin.math.pow
import kotlin.random.Random
import kotlin.system.measureTimeMillis
val MorseCode = mapOf(".-" to "A", "-..." to "B", "-.-." to "C", "-.." to "D", "." to "E", "..-." to "F", "--." to "G",
                    "...." to "H", ".." to "I", ".---" to "J", "-.-" to "K", ".-.." to "L", "--" to "M", "-." to "N",
                    "---" to "O", ".--." to "P", "--.-" to "Q", ".-." to "R", "..." to "S", "-" to "T", "..-" to "U",
                    "...-" to "V", ".--" to "W", "-..-" to "X", "-.--" to "Y", "--.." to "Z",
                    ".-.-.-" to ".")


fun main(args : Array<String>) {
    val elapsedTime = measureTimeMillis {
        //val line ="abc123def"
        //val regexp = """.*\d{3}.*"""
        //val pattern = regexp.toRegex()
       // println(line.matches(pattern))
       // for (test in 1 ..128)
       // println(formatDuration(Random.nextInt(1, 31536000)))
        //println(formatDuration(86400 + 31536000+31536000+1))
       // println(formatDuration(31536000 + 60))
        println( evenOrOdd(7))
    }
    println("The code took to execute $elapsedTime ms")
}

fun strhello(st:String):String{
    return st
}
fun mysum(a:Int,b:Int): Int {
    return a+b
}

/*
    Math.ceil(n) — возвращает наименьшее целое число, которое больше или равно аргумента n.
    Math.floor(n) — возвращает наибольшее целое число, которое меньше или равно аргументу n.
    Math.round(n) — возвращает целое число, ближайшее к аргументу n (округляет n).
    val startTime = System.currentTimeMillis()
            // ваш код, который нужно измерить
    val totalTime = System.currentTimeMillis() - startTime
            println("The code took to execute $totalTime ms")
    val longs: ArrayList<Long> = arrayListOf()
    Для любого символа, который имеет экранированную последовательность (\b, \r, \t, \\)
    println("$bits Line -> ${bits.length} 1-> ${bits.filter { it == '1' }.length} 0-> ${bits.filter { it == '0' }.length}")
    THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
*/