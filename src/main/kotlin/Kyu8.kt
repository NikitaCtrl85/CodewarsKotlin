import java.util.*

/*
    8 kyu
 */

public fun sum(mixed: List<Any>): Int {
    var s = 0
    mixed.map { if (it is String) s+= it.toInt() else
            if ( it is Int) s+=it
    }
    return s
}

fun points(games: List<String>): Int {
    var check =0
    games.map {
        check += if ( it[0].digitToInt() > it[2].digitToInt() ) 3 else
            if (it[0].digitToInt() < it[2].digitToInt()) 0 else 1
    }
    return check
}

fun simpleMultiplication(n: Int): Int {
    return  if (n % 2 == 0) n * 8 else  n * 9
}
fun makeUpperCase(str: String) = str.toUpperCase()//MakeUpperCase
fun hero(bullets: Int, dragons: Int) = (bullets - dragons * 2) >= 0
fun grow(arr: Array<Int>): Int {
    var m = 1
    arr.map { m *= it }
    return m
}
fun reverseSeq(n: Int): List<Int> {
    val lis:MutableList<Int> = mutableListOf()
    for ( i in n downTo   1)
        lis.add(i)
    return lis
}
//fun reverseSeq(n: Int) = (n downTo 1).toList()
fun invert(arr: IntArray) = arr.map { it * -1 }.toIntArray()
//fun invert(arr: IntArray) = arr.map { -it }.toIntArray()
fun subtractSum(n: Int): String {
    val listbelow = """1-kiwi 2-pear 3-kiwi 4-banana 5-melon 6-banana 7-melon 8-pineapple 9-apple 10-pineapple 11-cucumber 12-pineapple
        13-cucumber 14-orange 15-grape 16-orange 17-grape  18-apple    19-grape    20-cherry    21-pear    22-cherry
        23-pear 24-kiwi 25-banana 26-kiwi 27-apple 28-melon    29-banana    30-melon    31-pineapple
        32-melon 33-pineapple 34-cucumber 35-orange 36-apple    37-orange    38-grape    39-orange    40-grape
        41-cherry    42-pear    43-cherry    44-pear    45-apple    46-pear    47-kiwi    48-banana    49-kiwi 50-banana    51-melon
        52-pineapple    53-melon    54-apple 55-cucumber 56-pineapple    57-cucumber    58-orange    59-cucumber    60-orange    61-grape
        62-cherry    63-apple    64-cherry    65-pear 66-cherry    67-pear    68-kiwi    69-pear    70-kiwi    71-banana    72-apple    73-banana
        74-melon    75-pineapple    76-melon    77-pineapple    78-cucumber    79-pineapple    80-cucumber    81-apple    82-grape    83-orange    84-grape
        85-cherry    86-grape    87-cherry    88-pear    89-cherry    90-apple    91-kiwi    92-banana    93-kiwi    94-banana    95-melon
        96-banana    97-melon    98-pineapple    99-apple    100-pineapple
    """.trimIndent()
    val sum = n.toString().sumOf { it.digitToInt() }
    val num = """[a-z]+"""
    val found = num.toRegex().findAll(listbelow)
    var cuunt = 0
    for (s in found) {
        cuunt+=1
        if (cuunt == (n - sum)) return  s.value
    }
    return "apple"
}
fun stringToNumber(str: String) = str.toInt()
fun abbrevName(name:String): String {
    println(name)
    var ch = ""
    val b = """\s\w"""
    val found = b.toRegex().findAll(name)
    for ( st2 in found)  ch = st2.value
    return "${name[0].toUpperCase()}.${ch[1].toUpperCase()}"
}
//fun abbrevName(name: String) = name.split(" ").joinToString(".") { it.take(1).uppercase() }
fun litres(time: Double) = Math.round( (time - 0.99) * 0.5).toInt()
//fun litres(time: Double) = Math.floor(time/2).toInt()
fun isDivisible(n: Int, x: Int, y: Int): Boolean {
    return ( n % x == 0) && (n % y == 0)
}
fun century(number: Int): Int {
    return if ( number % 100 != 0 ) {
        number / 100 + 1
    } else {
        number / 100
    }
}
fun findSmallestInt(nums: List<Int>) = nums.sorted()[0]
//fun findSmallestInt(nums: List<Int>) = nums.minOf { it }
fun summation(n:Int):Int {
    var sum = 0
    for ( i in 1 ..n) sum +=i
    return sum
}
fun numberToString(num: Int) = num.toString()
fun removeChar(str: String) = str.substring(1,str.length-1)
//fun removeChar(str: String): String = str.substring(1,str.lastIndex)
fun evenOrOdd(number: Int): String = if (number % 2 == 0) "Even " else "Odd"
fun repeatStr(r: Int, str: String) : String = str.repeat(r)
fun areaOrPerimeter(l:Int, w:Int):Int {
    // fun areaOrPerimeter(l: Int, w: Int) = if (l == w) l * w else 2 * (l + w)
    return if (l == w) l*w else l*2+w*2
}
fun sum(numbers: IntArray): Int {
    //fun sum(numbers: IntArray) = numbers.filter { it > 0 }.sum()
    var sum : Int = 0
    for (n in numbers) if ( n > 0) {
        sum += n
    }
    return sum
}
fun multiply(x: Double, y: Double) :Double{
    //fun multiply(x: Double, y: Double) = x * y
    return x * y
}
fun loveFun(flowerA: Int, flowerB: Int): Boolean {
    //fun loveFun(flowerA: Int, flowerB: Int): Boolean = (flowerA + flowerB) %2 == 1
    if ((flowerA + flowerB) % 2 != 0 ) return true
    return false
}
fun maps(x: IntArray): IntArray {
    return x.map { it * 2 }.toIntArray()
    //Можно и так  return x.map{item -> item * 2}.toIntArray();
}
fun oddCount(n: Int): Int {
    // your code here
    return n / 2
}
fun getAge(yearsOld: String): Int {
    //fun getAge(yearsOld: String) = yearsOld.take(1).toInt()
    // your code here
    return yearsOld[0].digitToInt()

}
fun calculateYears(years: Int): Array<Int> {

    /*
        when (years) {
        1 -> arrayOf(1, 15 , 15)
        2 -> arrayOf(years, 24 , 24)
        else -> arrayOf(years, 24 + 4 * (years - 2), 24 + 5 * (years - 2))
     */
    // Your solution is here
    val catYearsForFirst : Int = 15
    val catYearsForSecond : Int = 9
    val catYearsForEachYearAfterThat : Int = 4

    val dogYearsForFirstYear = 15
    val dogYearsForSecondYear = 9
    val dogYearsForEachYearAfterThat = 5


    if (years == 2) {
        return arrayOf(years,catYearsForFirst + catYearsForSecond,
            dogYearsForFirstYear + dogYearsForSecondYear)
    } else if (years > 2) {
        return arrayOf(years,
            catYearsForFirst + catYearsForSecond + (catYearsForEachYearAfterThat * (years - 2) ),
            dogYearsForFirstYear + dogYearsForSecondYear + (dogYearsForEachYearAfterThat * (years - 2)) )
    }
    return arrayOf(years, catYearsForFirst, dogYearsForFirstYear)
}
fun digitize(n:Long): IntArray {
    // Convert number to reversed array of digits
    /*
    return n.toString().map(Character::getNumericValue).toIntArray().reversedArray()
     */

    val st:String = n.toString().reversed()
    var arrResult :IntArray = IntArray(st.length)
    for (index in st.indices) {
        arrResult[index] = st[index].digitToInt()
    }
    return arrResult
}
fun noSpace(x : String):String{
    return x.replace(" ","")
}
fun countPositivesSumNegatives(input : Array<Int>?) : Array<Int> {
    //Count of positives / sum of negatives

    /*
    if (input == null || input.isEmpty()) return emptyArray()
    val (positive, negative) = input.partition { it > 0 }
    return arrayOf(positive.count(), negative.sum())
     */

    if ((input == null) || input.isEmpty()) {
        return emptyArray()
    }
    val arrOut: Array<Int> = arrayOf(0,0)
    var n = 0;
    for (i in input.indices){
        if ( input[i] > 0) {
            n++
        } else if (input[i] < 0) {
            arrOut[1] = arrOut[1] + input[i]
        }
    }
    arrOut[0] = n
    return arrOut
}
