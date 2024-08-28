//Program 5
//Recursion: function calling itself again and again
//Two cases:
//1. Base Case: To prevent infinte recursion
//2. Recursive Case: this is where the recursion occur

//user input: readln().toInt()

fun factorial(n: Int):Int{
  if(n<=1) return 1
  else return n*factorial(n-1)
}
fun main(){
  println("Enter a value:")
  var x=readln().toInt()
  var fact=factorial(x)
  println(fact)
}
