package adjacentElementsProduct

fun main(args : Array<String>) {
    println(adjacentElements(mutableListOf(-23, 4, -3, 8, -12)))
    println(adjacentElementsBest(mutableListOf(-23, 4, -3, 8, -12)))

}

fun adjacentElements(inputArray: MutableList<Int>) :Int {
    var prod:Int
    var prodMax:Int
    var last:Int


    prodMax = Int.MIN_VALUE
    last = 0

    inputArray.forEachIndexed { index, it ->

        if(index != 0){
            prod = last * it

            if(prod > prodMax){
                prodMax = prod
            }
        }

        last = it

    }

    return prodMax
}

fun adjacentElementsBest(inputArray: MutableList<Int>): Int? {

    return (0 until inputArray.size - 1).map { inputArray[it] * inputArray[it + 1] }.max()
}




