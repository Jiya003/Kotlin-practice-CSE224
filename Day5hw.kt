val multi: Array<Array<Array<Int>>> = arrayOf(
    arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6)
    ),
    arrayOf(
        arrayOf(7, 8, 9),
        arrayOf(10, 11, 12)
    )
)

// Printing each 2D array (arrays of arrays)
println("Printing using contentToString:")
for (n in multi) {
    println(n.contentsToString())
}

// Printing each element of the 3D array
println("\nPrinting each element:")
for (a in multi) {
    for (b in a) {
        for (c in b) {
            print("$c ")
        }
        println()
    }
    println()
}
