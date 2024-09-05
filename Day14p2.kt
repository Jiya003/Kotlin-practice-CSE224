//Write a Kotlin program
//simulates a simple banking system. In this system, a user can repeatedly withdraw money from their account
//until they decide to stop. Implement the following features

//Made by Divyanshi Maurya,12219959

fun withdraw(amount: Int, withdrawal: Int): Int {
    var remainingAmount = amount
    var currentAmount = remainingAmount
    
    while (currentAmount >= withdrawal) {
        currentAmount =currentAmount- withdrawal
        println("Withdrawn money: $withdrawal, Remaining amount in the bank: $currentAmount")
    }
    
    return currentAmount
}

fun main() {
    var amount = 10000
    val withdrawal = 500
    
    println("Initial amount: $amount")
    amount = withdraw(amount, withdrawal)
    println("Final remaining amount: $amount")
}
