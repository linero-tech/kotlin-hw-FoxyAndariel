package lms_129

fun task8(number: Int): Int {
      var result = 0
    var remainingNumber = number

    while(remainingNumber > 0) {
        result += remainingNumber %10
        remainingNumber /= 10
        println("result = $result")
        println("Remaining = $number")
    }
    return result
}

fun main() {
    println(task8(number = 123))

}