package shapeArea

fun main(args: Array<String>){
    println(shapeArea(2))
}

fun shapeArea(n: Int): Int {
    return 2 * (n - 1) * ((n - 1) + 1) + 1
}
