package lms_126

fun task5(): String {
/* I'm Given  the number "X" Monday is 1 & Sunday is 7
* since there only "7 days" in a week that means that the nr 8 is going to be a 0 or and error
* So X = 1 - 8  so 7 days and 1 error */
    return """
       // Starting with 1 as monday
       INPUT X
       if val is 1
       OUTPUT Monday
       
       if val is 2 
       OUTPUT Tuesday
       
       if val is 3
       OUTPUT Wednesday
       
       if val is 4
       OUTPUT Thursday 
         
         if val is 5
         OUTPUT Friday
         
         if val is 6
         OUTPUT Saturday
         
         if val is 7
         OUTPUT Sunday
         
         if val is 8
         OUTPUT Error
    """
}
