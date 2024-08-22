//PROGRAM 1
//ARITHEMATIC OPERATORS
fun main() {
    var a=10
    var b=5
    
    //arithmetic operators
    var add=a+b
    println("Addition of $a and $b is $add")
    //directly on console using {}
    println("Subtraction of $a and $b is ${a-b}")
    println("Multiplication of $a and $b is ${a*b}")
    println("Division of $a and $b is ${a/b}")
    println("Modulus of $a and $b is ${a%b}")
    
    //different notation
    println("Add:"+a.plus(b))
    println("Sub:"+a.minus(b))
    println("Mul:"+a.times(b))
    println("Div:"+a.div(b))
    println("Mod:"+a.rem(b))

}

//PROGRAM 2
//Relational Operators

fun main() {
    var a = 10
    var b = 5
    
    // Relational operators
    println("$a > $b : ${a > b}")
    println("$a < $b : ${a < b}")
    println("$a >= $b : ${a >= b}")
    println("$a <= $b : ${a <= b}")
    println("$a == $b : ${a == b}")
    println("$a != $b : ${a != b}")
    
    // Different notation using `compareTo`
    println("$a > $b : ${a.compareTo(b) > 0}")
    println("$a < $b : ${a.compareTo(b) < 0}")
    println("$a >= $b : ${a.compareTo(b) >= 0}")
    println("$a <= $b : ${a.compareTo(b) <= 0}")
    println("$a == $b : ${a.equals(b)}")
    println("$a != $b : ${a != b}")
}

//PROGRAM 3
//ASSIGNMENT OPERATORS

fun main() {
    var a = 10
    var b = 5
    
    // Relational operators
    println("The intial value of a: $a and b: $b")
    print("$a += $b :")
    a=a+b;
    println("$a");
   
    print("$a -= $b :")
    a=a-b;
    println("$a");   

    print("$a *= $b :")
    a=a*b;
    println("$a");

    print("$a /= $b :")
    a=a/b;
    println("$a");

    print("$a %= $b :")
    a=a%b;
    println("$a");
   
}

    
      
fun main() {
     var a = -5
    var b=true
    var c=10
    
    
    //Unary Operator
    
    println("Intial value of a: $a")

    //plus sign(positive number)
    println("Unary Plus: ${+a}")//or a.unaryPlus()
    //minus sign(negative number)
    println("Unary Minus: ${-a}")//or a.unaryMinus()
    println("Increment by 1: ${++c}")//a.inc()
    println("Decrement by 1: ${--c}")//a.dec()
    
    
    println("Not: ${!b}")//b.not()
    
    
    
    
   
}
