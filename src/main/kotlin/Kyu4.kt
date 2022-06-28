/*
    4 kyu
 */
const val ONE_YEAR = 31536000
const val ONE_DAY = 86400
const val ONE_HOUR = 3600
const val ONE_MINUTE = 60
const val AND = " and "
const val COM = ", "
fun formatDuration(seconds: Int): String {

    var  timeinwords = ""
    var sec = seconds
    var y = 0
    var d = 0
    var h = 0
    var m = 0
    while (sec >= ONE_MINUTE){
        if (sec >= ONE_YEAR){ sec -= ONE_YEAR
            y+=1
        } else if ( sec >= ONE_DAY ){ sec -= ONE_DAY
            d+=1
        } else if (sec >= ONE_HOUR){ sec -= ONE_HOUR
            h+=1
        } else if ( sec >= ONE_MINUTE){ sec -= ONE_MINUTE
            m+=1
        } else if ( sec < ONE_MINUTE){ sec
        }
    }

    if (y > 0) {
        timeinwords = if (y == 1) {
            "1 year"
        } else "$y years"
    }
    if (d > 0){
        if ((y > 0)&&(h + m + sec == 0)) { timeinwords += AND}
        else if (y > 0) {
            timeinwords += COM
        }
        timeinwords += if (d == 1) {
            "1 day"
        } else "$d days"
    }
    if (h > 0){
        if ((y + d > 0)&&(m + sec == 0)) { timeinwords += AND}
        else if (y + d > 0) {
            timeinwords += COM
        }
        timeinwords += if (h == 1) {
            "1 hour"
        } else "$h hours"
    }
    if (m > 0) {
        if ((y + d + h > 0)&&(sec == 0)) { timeinwords += AND}
        else if (y + d + h > 0) {
            timeinwords += COM
        }
        timeinwords += if (m == 1) {
            "1 minute"
        } else "$m minutes"
    }
    if (sec > 0) {
        if (y + d + h + m > 0) { timeinwords += AND}
        timeinwords += if (sec == 1) {
            "1 second"
        } else "$sec seconds"
    }
    if (seconds == 0) timeinwords = "now"
    return timeinwords
}


fun getPINs(observed: String): List<String> {
    // This is your job, detective!
    /*
    ┌───┬───┬───┐
    │ 1 │ 2 │ 3 │
    ├───┼───┼───┤
    │ 4 │ 5 │ 6 │
    ├───┼───┼───┤
    │ 7 │ 8 │ 9 │
    └───┼───┼───┘
        │ 0 │
        └───┘
 */

    val button = mapOf("0" to "08", "1" to "124","2" to "1235","3" to "236", "4" to "1457",
        "5" to "24568", "6" to "3569", "7" to "478", "8" to "57890", "9" to "689")
    var maybe = mutableListOf<String>()

    when( observed.length ) {
        1 -> {
            for (st in button[observed].toString().iterator() ){
                maybe.add(st.toString())
            }
        }

        2 -> {
            val str0 = button[observed[0].toString()].toString()
            val str1 = button[observed[1].toString()].toString()
            for (s0 in str0){
                for (s1 in str1){
                    maybe.add(s0.toString() + s1)
                }
            }
        }
        3-> {
            val str0 = button[observed[0].toString()].toString()
            val str1 = button[observed[1].toString()].toString()
            val str2 = button[observed[2].toString()].toString()
            for (s0 in str0){
                for (s1 in str1){
                    for (s2 in str2){
                        maybe.add(s0.toString() + s1 + s2)
                    }
                }
            }
        }
        4-> {
            val str0 = button[observed[0].toString()].toString()
            val str1 = button[observed[1].toString()].toString()
            val str2 = button[observed[2].toString()].toString()
            val str3 = button[observed[3].toString()].toString()
            for (s0 in str0){
                for (s1 in str1){
                    for (s2 in str2){
                        for (s3 in str3)
                            maybe.add(s0.toString() + s1 + s2 + s3)
                    }
                }
            }
        }
        5-> {
            val str0 = button[observed[0].toString()].toString()
            val str1 = button[observed[1].toString()].toString()
            val str2 = button[observed[2].toString()].toString()
            val str3 = button[observed[3].toString()].toString()
            val str4 = button[observed[4].toString()].toString()
            for (s0 in str0){
                for (s1 in str1){
                    for (s2 in str2){
                        for (s3 in str3){
                            for (s4 in str4) {
                                maybe.add(s0.toString() + s1 + s2 + s3+ s4)
                            }
                        }
                    }
                }
            }
        }

        6-> {
            val str0 = button[observed[0].toString()].toString()
            val str1 = button[observed[1].toString()].toString()
            val str2 = button[observed[2].toString()].toString()
            val str3 = button[observed[3].toString()].toString()
            val str4 = button[observed[4].toString()].toString()
            val str5 = button[observed[5].toString()].toString()
            for (s0 in str0){
                for (s1 in str1){
                    for (s2 in str2){
                        for (s3 in str3){
                            for (s4 in str4) {
                                for (s5 in str5){
                                    maybe.add(s0.toString() + s1 + s2 + s3+ s4+s5)
                                }
                            }
                        }
                    }
                }
            }
        }

        7-> {
            val str0 = button[observed[0].toString()].toString()
            val str1 = button[observed[1].toString()].toString()
            val str2 = button[observed[2].toString()].toString()
            val str3 = button[observed[3].toString()].toString()
            val str4 = button[observed[4].toString()].toString()
            val str5 = button[observed[5].toString()].toString()
            val str6 = button[observed[6].toString()].toString()
            for (s0 in str0){
                for (s1 in str1){
                    for (s2 in str2){
                        for (s3 in str3){
                            for (s4 in str4) {
                                for (s5 in str5){
                                    for (s6 in str6){
                                        maybe.add(s0.toString() + s1 + s2 + s3+ s4 + s5 + s6)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


        8-> {
            val str0 = button[observed[0].toString()].toString()
            val str1 = button[observed[1].toString()].toString()
            val str2 = button[observed[2].toString()].toString()
            val str3 = button[observed[3].toString()].toString()
            val str4 = button[observed[4].toString()].toString()
            val str5 = button[observed[5].toString()].toString()
            val str6 = button[observed[6].toString()].toString()
            val str7 = button[observed[7].toString()].toString()
            for (s0 in str0){
                for (s1 in str1){
                    for (s2 in str2){
                        for (s3 in str3){
                            for (s4 in str4) {
                                for (s5 in str5){
                                    for (s6 in str6){
                                        for (s7 in str7){
                                            maybe.add(s0.toString() + s1 + s2 + s3+ s4 + s5 + s6 + s7)
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        9-> {
            val str0 = button[observed[0].toString()].toString()
            val str1 = button[observed[1].toString()].toString()
            val str2 = button[observed[2].toString()].toString()
            val str3 = button[observed[3].toString()].toString()
            val str4 = button[observed[4].toString()].toString()
            val str5 = button[observed[5].toString()].toString()
            val str6 = button[observed[6].toString()].toString()
            val str7 = button[observed[7].toString()].toString()
            val str8 = button[observed[8].toString()].toString()
            for (s0 in str0){
                for (s1 in str1){
                    for (s2 in str2){
                        for (s3 in str3){
                            for (s4 in str4) {
                                for (s5 in str5){
                                    for (s6 in str6){
                                        for (s7 in str7){
                                            for (s8 in str8){
                                                maybe.add(s0.toString() + s1 + s2 + s3+ s4 + s5 + s6 + s7 + s8)
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    return maybe
}
fun decodeBits(bits: String): String {
    var minLength1:Int = 1024
    var minLength0:Int = 1024
    var length0:Int = 0
    var length1:Int = 0
    var decode:String = ""
    var beepmorse:String = bits.trim('0')
    for (b in beepmorse){
        if (b == '0'){
            length0+=1
        } else if ( b == '1'){
            if ((length0 < minLength0)&&(length0 != 0)){
                minLength0 = length0
            }
            length1 = 0
        }
    }
    length0 = 0
    beepmorse+='0'
    for (b in beepmorse.iterator()){
        if (b == '1'){
            length1+=1
        } else if (b == '0'){
            if ((length1 < minLength1)&&(length1 != 0)){
                minLength1 = length1
            }
            length1 = 0
        }

    }
    length1 = 0
    val minBeepX3 = minLength1*3
    for (beep in beepmorse ){
        if ( beep == '0'){
            if  (length1 == minLength1)   {
                decode += if (minLength1 > minLength0) {
                    '-'
                } else {
                    '.'
                }
            } else if (length1 > minLength1 ) {
                decode+='-'
            }
            length1 = 0
            length0 += 1
        } else if (beep == '1'){
            if ((length0 > minLength1)&&( length0 <= minBeepX3)){
                decode+=' '
            }
            if (length0 > minBeepX3){
                decode+="   "
            }
            length1 += 1
            length0 = 0
        }
    }
    println("[$bits]")
    return decode
}
fun decodeMorse(code: String): String {
    //Decode the Morse code
    var chmorse: String = ""
    var decode: String = ""
    var space: Byte = 0
    for (str in code.iterator()) {
        if (str != ' ') {
            chmorse += str
        } else {
            if (!MorseCode[chmorse].isNullOrEmpty()) {
                decode += MorseCode[chmorse].toString()
            } else {
                space++
                if (space > 1) {
                    decode += " "
                    space = 0
                }
            }
            chmorse = ""
        }
    }
    if (chmorse.isNotEmpty()) {
        decode += MorseCode[chmorse].toString()
    }
    return decode.trim()
}
/*
fun decodeWord(wordCode: String): String {
    return wordCode.split(" ")
        .map { MorseCode[it] }
        .joinToString("")
}

fun decodeMorse(code: String): String {
    return code.trim().split("   ")
        .joinToString(" ") { decodeWord(it) }
}
*/
/*
fun decodeMorse(code: String): String {
  return code.split(" ")
             .map({ x -> MorseCode[x] ?: " " })
             .joinToString("")
             .replace("  "," ")
             .trim()
}
     */

