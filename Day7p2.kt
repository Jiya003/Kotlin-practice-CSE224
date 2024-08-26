//Program 7
//when
//similar to switch statement
fun main() {
   val day = 2

   val result = when (day) {
     1 -> "Monday"
     2 -> "Tuesday"
     3 -> "Wednesday"
     4 -> "Thursday"
     5 -> "Friday"
     6 -> "Saturday"
     7 -> "Sunday"
     else -> "Invalid day."
   }
   println(result)
}


//Program 8
//when as a statement
//it will not return a value
//it will be based on a condition

fun main() {
   val number = 8

   when{
       number %2 ==0 -> println("$number is even")
       number %2 !=0-> println("$number is odd")
       else -> println("Unexpected number")
   }
}
