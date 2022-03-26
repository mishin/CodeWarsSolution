package com.twotoone

fun longest(s1: String, s2: String): String {
    val array1 = (s1 + s2).toCharArray().toSet().sorted()

    // your code
    return array1.joinToString("")
}

fun multiply(x: Double, y: Double): Double {
    return x * y
}

fun find(integers: Array<Int>): Int {
    var even = integers.take(3).filter { i -> isEven(i) }.count()
    for (i in integers) {
        if (even > 1) {
            if (!isEven(i)) return i
        } else {
            if (isEven(i)) return i
        }
    }
    return 0
}

fun isEven(num: Int) = (num % 2 == 0)