package lms_127

fun task7(sentence: String): Int {
    val result = sentence.length

    return result
}

fun main(){
    println(task7(sentence = "I love GBG")) //10
    println(task7(sentence = "")) //0
    println(task7(sentence = "1234 1234")) //9
    println(task7(sentence = "I")) //1
    println(task7(sentence = "I love Gothenburg")) //17


}