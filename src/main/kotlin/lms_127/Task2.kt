package lms_127

fun task2() {
    /*This is the example I am given:
    "Hello Jane, you are from Sweden and you were born in June" */

      val name = "Jonathan"
      val country = "Sweden"
      val month = "July"

     println("Hello $name, you are from $country and you were born in $month")

}
fun main(){
     task2()

    println("My name is Jonathan")
    println("My country is Sweden")
    println("I am 180 centimeters tall")

    print("> Enter your name: ")
    val name = readLine()

    print("> Enter your country: ")
    val country = readLine()


    // Option 2: String templates
    println("Hello $name, you come from $country")



}
