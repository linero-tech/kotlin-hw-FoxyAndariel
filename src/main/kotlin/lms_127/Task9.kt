package lms_127

fun task9(sentence: String, character: Char): Boolean {
    return sentence.contains(character, ignoreCase = true)
}

fun main(){
    println(task9(sentence = "I code In KOTLIN", character ='i' )) //true
    println(task9(sentence = "I code In KOTLIN", character ='c' )) //true
    println(task9(sentence = "I code In KOTLIN", character ='K' )) //true
    println(task9(sentence = "I code In KOTLIN", character ='N' )) //true
}