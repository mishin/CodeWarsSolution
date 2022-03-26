package com.company

import java.util.*

internal object CountingDuplicates {
    @JvmStatic
    fun duplicateCount(text: String): Int {
        val charCountMap = HashMap<Char, Int>()
        for (c in text.lowercase(Locale.getDefault()).toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap[c] = charCountMap[c]!! + 1
            } else {
                charCountMap[c] = 1
            }
        }
        var count = 0
        for ((_, value) in charCountMap) {
            if (value > 1) {
                count++
            }
        }
        return count
    }
}