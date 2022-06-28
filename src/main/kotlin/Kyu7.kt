import kotlin.math.pow

/*
    7 kyu
 */

fun getMiddle(word : String) : String {
    //Code goes here!
    return ""
}


fun highAndLow(numbers: String): String {
    //Highest and Lowest
    /*
        val x = numbers.split(" ").map { it.toInt() }.sorted()
        return "${x.last()} ${x.first()}"
    */

    var numbstr:String = ""
    var arrList: ArrayList<Int> = arrayListOf()
    for (str in numbers.iterator()){
        if (str != ' ') { numbstr+=str
        } else { arrList.add(numbstr.toInt())
            numbstr=""
        }
    }
    if (numbstr.isNotEmpty()){
        arrList.add(numbstr.toInt())
    }
    return "${arrList.maxOf { it }} ${arrList.minOf { it }}"
}
fun seven(n:Long): LongArray {
    //A Rule of Divisibility by 7 //Правило делимости на 7
    /*
        if (n > 99) seven(n / 10 - n % 10 * 2, i + 1)
        else longArrayOf(n, i)
     */

    var ns:Long = n
    var step:Long = 0;
    while(ns >= 100) {
        step++
        ns = ns/10 - (ns % 10)*2
        if (ns <= 98)   break
    }
    return longArrayOf(ns,step)
}
fun movie(card:Int, ticket:Int, perc:Double):Int {
    // Going to the cinema
/*
    var systemA = 0
    var systemB = card.toDouble()
    var prev = ticket.toDouble()
    var times = 0
    while (systemA <= Math.ceil(systemB))
    {
        systemA += ticket
        prev *= perc
        systemB += prev
        times += 1
    }
    return times
  */
    var multisum : Double = 0.0
    var goCinema : Int = 0
    val c : Int = card + 1
    while( (Math.ceil(multisum) + c )  > ticket * goCinema){
        goCinema++
        multisum+=ticket * perc.pow(goCinema)
    }
    return goCinema
}