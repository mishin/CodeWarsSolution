package com.company

import java.util.HashMap

internal class Solution2 {
    fun search(nums: IntArray?, target: Int): Int {
        return 0
    }

    companion object {
        fun toCamelCase(s: String): String {
            val array = s.toCharArray()
            for (i in 1..(array.size - 1)) {
                if (array[i - 1] == '-' || array[i - 1] == '_') {
                    array[i] = Character.toUpperCase(array[i])
                }
            }
            return String(array).replace("[-_]".toRegex(), "")
        }

        fun duplicateCount(text: String): Int {
            val charCountMap = HashMap<Char, Int>()
            for (c in text.lowercase().toCharArray()) {
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
}