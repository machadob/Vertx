fun main(args: Array<String>) {
    val numbers = arrayOf(40, 50, 30, 20, 10)
    mergeSort(numbers)
}

fun mergeSort(input:Array<Int>){
   input.forEach { println(it) }
}