package lms_127

fun task3(radius: Double): Double {
val result = 2.0 * radius * 3.1416
    return result


}

fun main() {

    println(task3(radius = 2.0)) //12.57
    println(task3(radius = 0.0)) //00.00
    println(task3(radius = 20.0)) //125.664
    println(task3(radius = 1.0)) //6.28
}
