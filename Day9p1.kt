//Program 1
//function with default arguments
fun sum(a: Int=10,b:Int=30){
    println("Sum is ${a+b}")
}
fun main() {
    sum(20,50)//parameters are given
    sum()//no parameters are given, default parameters will work
}


//Program 2
//function without default arguments
fun sum(a: Int,b:Int){
    println("Sum is ${a+b}")
}
fun main() {
    sum(20,50)
    //sum() it will give error as there are no parameters
}

//Program 3
//in function we specify the return value
fun sum(a: Int,b:Int):Int{
    val r=a+b
    return r
}
fun main(args:Array<String>) {
    val a=10
    val b=20
    val result=sum(a,b)
    println(result)
}

//Program 4
//Task: Convert farenheit to celsius and vice versa using functions
fun tofahren(c:Double):Double{
    val f=((9/5)*c)+32
    return f
}

fun tocel(f:Double):Double{
    val c=((5/9)*f)-32
    return c
}
fun main() {
    val cel:Double=35.0
    val fah=tofahren(cel)
    println("$cel C -> $fah F")
    
    val fahren:Double=100.0
    val ce=tocel(fahren)
    println("$fahren F -> $ce C")
}
