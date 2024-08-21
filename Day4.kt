fun main() {
    val a=10;
    val b=20;
    val result="Sum of $a and $b is ${a+b}"
    println(result)
}

fun main() {
    var Letter: Char //Char is used to represent a Character
    Letter='D'
    println(Letter)//printing Character
    
    println('*')
    println('\\')//escape character
    println('$')
}


fun main() {
    println("Divyanshi")
    println("Divyanshi")
    println("Divyanshi")
    println("Divyanshi")
    println("Divyanshi")
    
    //Escape Character
    val name: String="\nDivyanshi\nDivyanshi\nDivyanshi\nDivyanshi\nDivyanshi"
    println(name)
    
    //triple quotes
    val name1: String="""
    Divyanshi
    Divyanshi
    Divyanshi
    Divyanshi
    Divyanshi"""
    println(name1)
    
    var n="""Div
    	Div
        	Div
            		Div
                		Div"""
    println(n)
    
    var a="""
    		Div
        Div		Div
        	Div
    """
    println(a)
}

/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    //Arrays of Integers
    val numbers=arrayOf(1,2,3,4,5)
    println(numbers)
    //Arrays of Strings
    val words: Array<String >
    words=arrayOf("Divyanshi","Tanisha","Priya")
    println(words)
    //Array of squares using lambda
    val squares=Array(5) {i -> i*i}
    println(squares)
}
