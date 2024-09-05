//Design a Kotlin program for a store to determine eligibilty for a special offer based on the total amount and membership status
fun Discount(amt: Int, membership:Boolean){
    if(amt>=1000 && membership==true){
        println("Customer has 20% discount")
    }else if(amt>=1000 && membership==false){
        println("Customer has 10% discount")
    }
    else{
        println("Customer doesn't have discount")
    }
}
fun main(){
    val amount=1500
    val hasMembership=false
    
    Discount(amount, hasMembership)
}
