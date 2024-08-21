//PROGRAM 5
//Simple Type casting
fun main() {
    val x: Int=3;
    //val y: Long =x //Error (We have predefined functions)
    val y:Long =x.toLong()
    println(y) 
}

//PROGRAM 6
//Safe and Unsafe Type casting
fun main() {
    val s: String="Kotlin"
    val y: String=s as String
    
    println("The result of Unsafe Type casting: $y")
    
    //ClassCast Exception
    //val a: Integer= s as Integer
    //println("The result of Unsafe Type casting: $a") 
    
    
}
