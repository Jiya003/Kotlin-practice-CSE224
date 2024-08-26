//Program 1
//if condition
fun main() {
    val temp=25;
    if(temp>20){
        println("It's a warm day.")
    }
  //Output: It's a warm day
}

//Program 2
fun main() {
    val temp=15;
    if(temp>20){
        println("It's a warm day.")
    }
  //No Output
}

//Program 3
//if else
fun main() {
    val age=18;
    if(age>=18){
        println("You are an adult.")
    }else{
        println("You are a minor")
    }
  //Output: You are an adult.
}


//Program 4
//Grading system: Scenario based
fun main() {
    val marks=70
    
    if(marks>=90 && marks<=100){
        println("A grade")
    }else if(marks>=80 && marks<90){
        println("B grade")
    }else if(marks>=70 && marks<80){
        println("C grade")
    }else{
        println("D grade")
    }
}

//Program 5
//Construct calculator by using if-else else if for all arithmetic operator
//nested if
fun main() {
    val a=100
    val b=45
    
    val operator='+'
    
    if(operator=='+'){
        println("$a + $b = ${a+b}")
    }else if(operator=='-'){
        println("$a - $b = ${a-b}")
    }else if(operator=='*'){
        println("$a * $b = ${a*b}")
    }else if(operator=='/'){
        if(b!=0){
            println("$a / $b = ${a/b}")            
        }else{
            println("denominator cannot be zero.")
        }
        
    }else if(operator=='%'){
        println("$a % $b = ${a%b}")
    }else{
        println("Wrong operator entered")
    }
}


//Program 6
//Age classification
fun main() {
    
    var age: Int=16
    
    if(age<13){
        println("Child")
    }else if(age>=13 && age<=19){//or else if(age in 13..19) (range)
    	println("Teen")
    }else if(age>19 && age<=120){
        println("Adult")
    }else{
        println("Wrong age.")
    }
}
