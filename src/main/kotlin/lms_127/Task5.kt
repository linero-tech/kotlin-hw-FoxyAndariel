package lms_127

fun task5(valueForA: Int, valueForB: Int): Pair<Int, Int> {
    // Do not change or delete these variables
    var a = valueForA
    var b = valueForB

     val temporary = a
    a = b
    b = temporary


    // Do not erase or change this statement
    return Pair(a, b)

}

fun main(){
    println(task5(valueForA = 1, valueForB = 2 ))
    println(task5(valueForA = 10, valueForB = 20 ))
    println(task5(valueForA = 20, valueForB = 30 ))
    println(task5(valueForA = 30, valueForB = 40 ))

}