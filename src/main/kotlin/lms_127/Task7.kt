package lms_127


fun task7(sentence: String): Int {
/*Inline means to make the same result using fewer lines so instead of for example 2 lines
   we only use 1 line */

    
    return sentence.length
}

fun main(){
    println(task7(sentence = "I love GBG")) //10
    println(task7(sentence = "")) //0
    println(task7(sentence = "1234 1234")) //9
    println(task7(sentence = "I")) //1
    println(task7(sentence = "I love Gothenburg")) //17


}