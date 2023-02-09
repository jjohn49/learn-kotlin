//Main method
fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    firstMethdod()
}

fun firstMethdod(){
    val arr: IntArray = intArrayOf(1,2,3)

    println(arr.asList())

    arr.sort()

    println(arr.toString())

}