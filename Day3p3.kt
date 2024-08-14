class abc{
    var a=12
    var b=16
    fun add(){        
        println(a+b)
        var c=13 //local variable
        println(c)
    }
    
    fun add1(){
        //will give error : println(a+c)
    }
}

 fun main(){
     //created a object for the class
     val obj=abc()
     obj.add()
     obj.add1()
 }
