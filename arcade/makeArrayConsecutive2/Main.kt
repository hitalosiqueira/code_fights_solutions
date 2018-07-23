package arcade.makeArrayConsecutive2

fun main(args: Array<String>){
    println(makeArrayConsecutive2(mutableListOf(0, 3)))
}

fun makeArrayConsecutive2(statues: MutableList<Int>): Int {
    statues.sort()
    return (0 until statues.size - 1).map { statues[it + 1] - statues[it] }.filter { it >= 2 }.map{it - 1}.sum()
}