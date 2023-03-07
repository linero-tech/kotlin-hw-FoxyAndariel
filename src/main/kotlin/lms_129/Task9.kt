package lms_129

fun task9(temperature: String): String {
    val magnitude = temperature.substring(0, temperature.length - 1).toDouble()
    val unit = temperature.last().uppercase()

    val convertedTemp = if (unit =="F") {
     (magnitude * 9 / 5 + 32 ).toInt()
    } else {
        ((magnitude - 32) * 5 / 9).toInt()
        20

    }

    val convertedUnit = if (unit== "C") "F" else "C"

    return "$convertedTemp$convertedUnit"
}
