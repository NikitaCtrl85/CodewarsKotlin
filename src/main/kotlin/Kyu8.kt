/*
    8 kyu
 */

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
