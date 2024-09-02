//fibonacci series
fun fibonacci(n: Int): Int {
    if (n <= 1) return n
    return fibonacci(n - 1) + fibonacci(n - 2)
}

fun main() {
    val count = 10  // Number of Fibonacci numbers to generate
    for (i in 0 until count) {
        print("${fibonacci(i)} ")
    }
}
