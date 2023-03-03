package lms_127

fun task8(sentence: String, character: Char): Int {
    // don't forget that you can "Inline" to make the code look better and more clear
    return sentence.count { it == character }
}

fun main(){
    println(task8(sentence = "I code in KOTLIN", character = 'I' )) //2
    println(task8(sentence = "I code in KOTLIN", character = 'i' ))
    println(task8(sentence = "I code in KOTLIN", character = 'b' ))
    println(task8(sentence = "I code in KOTLIN", character = 'o' ))

}