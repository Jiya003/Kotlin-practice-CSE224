//Program 1
fun main() {
    for(i in 1..5){//range
        println(i)
    }
}

//Program 2
//until
fun main() {
    for(i in 1 until 5){
        println(i)
    }
}

//Program 3
//reverse for loop
fun main(args: Array<String>) {
    for(item in 5 downTo 1){
        println(item)
    }    
}

//Program 4
//Reverse with step size
fun main(args: Array<String>) {
    for(item in 5 downTo 1 step 2){
        println(item)
    }    
}

//Program 5
//Iterating over a list
//when only elements need to be accessed
fun main(){
  val fruits=listOf("Apple","Banana","Cherry");
  for(fruit in fruits){
    println("Fruit: $fruit")
  }
}

//Program 6
//when both element and index needs to be accessed
fun main(){
  val fruits=listOf("Apple","Banana","Cherry");
  for(fruit in fruits.indices){
    println("Fruit: $fruit : ${fruits[fruit]}")
  }
}

