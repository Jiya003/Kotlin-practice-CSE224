fun main() {
  //PROGRAM 1
    //Arrays of Integers
    val numbers=arrayOf(1,2,3,4,5)
    println(numbers.contentToString()) // Correct way to print array contents
    //if we directly print it it will show error, java.lang

    //Arrays of Strings
    val words: Array<String>
    words=arrayOf("Divyanshi","Tanisha","Priya")
    println(words.contentToString())
    //Array of squares using lambda
    val squares=Array(5) { i -> i * i}
    println(squares.contentToString())
    
    //retrieve the values of an array
    val firstNumber=numbers[0]
    println("The firstNumber of the numbers array: $firstNumber")
    
    val firstWord=words[0]
    println("The first word of the words array: $firstWord")
    
    var firstsquare=squares[0]
    println("The first Number of the squares array: $firstsquare before changing")

    //PROGRAM 2
    //modifying the values of the array
    squares[0]=66
    words[1]="Kotlin is fun"
    
    //reassinging the value
    firstsquare=squares[0]
    println("The first Number of the squares array: $firstsquare after changing")


    //PROGRAM 3
    //iterating the array using for loop
    //for each
    for(num in numbers){
        print("$num ")
    }
    println()
    for(word in words){
        println(word)
    }


    //PROGRAM 4
    //Multi-dimensional array
    val multi: Array<Array<Int>>
    multi=arrayOf(arrayOf(1,2,3),arrayOf(4,5,6),arrayOf(7,8,9))
    for(n in multi){
        println(n.contentToString())
    } 
    
    //or
    for(a in multi){
        for(b in a){
            print("$b ")
        }
        println()
    }
    
    
    
    
    
    
    
}
